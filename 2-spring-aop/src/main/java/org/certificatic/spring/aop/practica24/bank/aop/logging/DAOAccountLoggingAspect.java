package org.certificatic.spring.aop.practica24.bank.aop.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.certificatic.spring.aop.practica24.bank.app.model.Account;
import org.certificatic.spring.aop.util.bean.api.IColorWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

// Define el Bean como Aspecto
@Aspect
@Component("daoAccountLoggingAspect")
@Slf4j
public class DAOAccountLoggingAspect implements Ordered {

	private @Getter int order = 3;

	@Autowired
	private IColorWriter colorWriter;

	// Define Pointcut que intercepte dataAccessLayer() y cache los argumentos
	@Pointcut(value = "org.certificatic.spring.aop.practica24.bank.aop.PointcutDefinition.dataAccessLayer() "
			+ "&& args(xx, ..)")
	public void beforeDAOAccountMethodExecutionAccountPointcut(Account xx) {
	}

	// Define Advice Before
	@Before("beforeDAOAccountMethodExecutionAccountPointcut(yy)")
	public void beforeDAOAccountMethodExecutionAccount(JoinPoint jp, Account yy) {

		String method = jp.getSignature().getName();

		log.info("Inside accountDAO.updateBalance(). Account: {}", yy.getAccountNumber());

	}

	// Define Pointcut que intercepte dataAccessLayer() y cache los argumentos
	@Pointcut(value = "org.certificatic.spring.aop.practica24.bank.aop.PointcutDefinition.dataAccessLayer() "
			+ "&& args(aa, ..)")
	public void beforeDAOAccountMethodExecutionLongPointcut(Long aa) {
	}

	// Define Advice Before
	@Before("beforeDAOAccountMethodExecutionLongPointcut(bb)")
	public void beforeDAOAccountMethodExecutionLong(JoinPoint jp, Long bb) {

		String method = jp.getSignature().getName();

		log.info("Inside accountDAO." + method + "(). Finding accounts for customer: {}", bb);
	}

}
