package org.certificatic.spring.aop.practica24.bank.aop.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.util.StopWatch.TaskInfo;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

//Define el Bean como Aspecto
@Aspect
@Component("profilingAspect")
@Slf4j
public class ProfilingAspect implements Ordered {

	private @Getter int order = 1;

	// Define Around Advice que intercepte cualquier método del paquete
	// org.certificatic.spring.aop.practica24.bank..* y cache al menos el primer
	// argumento
	@Around(value = "within( org.certificatic.spring.aop.practica24.bank.web..* ) && "
			+ "args(obj,..)", argNames = "obj")
	public Object beforeAccountMethodExecutionAccount(ProceedingJoinPoint pjp, Object obj) throws Throwable {

		StopWatch stopWatch = new StopWatch();
		stopWatch.start(pjp.toShortString());

		boolean isExceptionThrown = false;

		try {

			return pjp.proceed(); // proceder con la ejecución al target object

		} catch (RuntimeException e) {
			isExceptionThrown = true;
			throw e;
		} finally {
			stopWatch.stop();
			TaskInfo taskInfo = stopWatch.getLastTaskInfo();

			String profileMessage = taskInfo.getTaskName() + ": " + taskInfo.getTimeMillis() + " ms"
					+ (isExceptionThrown ? " (thrown Exception)" : "");

			log.info("{}, object intercepted: {}", profileMessage, obj.getClass().getSimpleName());
		}
	}
}
