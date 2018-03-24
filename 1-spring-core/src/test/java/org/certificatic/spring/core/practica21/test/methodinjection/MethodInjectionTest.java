package org.certificatic.spring.core.practica21.test.methodinjection;

import org.certificatic.spring.core.practica21.methodinjection.bean.SingletonBeanNoRecomendado;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { MethodInjectionTest.location })
public class MethodInjectionTest {

	public static final String location = "classpath:/spring/practica21/method-injection-context.xml";

	@Autowired
	private SingletonBeanNoRecomendado singletonBean1;

	@Autowired
	private SingletonBeanNoRecomendado singletonBean2;

	@Before
	public void setUp() {
		Assert.assertNotNull(singletonBean1);
		Assert.assertNotNull(singletonBean2);

		// valida que los singletonBean 1 y 2 son los mismos
		Assert.assertSame(singletonBean1, singletonBean2);

		// valida que los prototypes en cada singletonBean 1 y 2 son distintos
		Assert.assertNotSame(singletonBean1.createProcessor(), 
							 singletonBean2.createProcessor());
	}

	@Test
	public void methodInjectionTest() {

		log.info("methodInjectionTest -------------------");

		String dataExpected = ">atad-ym/<... atad erom ,atad erom ,ataD>atad-ym<\n"
				+ ">atad-ym/<... atad erom ,atad erom ,ataD>atad-ym<\n"
				+ ">atad-ym/<... atad erom ,atad erom ,ataD>atad-ym<";

		String data = null;

		data = singletonBean1.process("<my-data>Data, more data, more data ...</my-data>");
		Assert.assertNotNull(data);
		Assert.assertEquals(dataExpected, data);
		log.info("-------");

		data = singletonBean1.process("<my-data>Data, more data, more data ...</my-data>");
		Assert.assertNotNull(data);
		Assert.assertEquals(dataExpected, data);
		log.info("-------");

		data = singletonBean2.process("<my-data>Data, more data, more data ...</my-data>");
		Assert.assertNotNull(data);
		Assert.assertEquals(dataExpected, data);
		log.info("-------");

		data = singletonBean2.process("<my-data>Data, more data, more data ...</my-data>");
		Assert.assertNotNull(data);
		Assert.assertEquals(dataExpected, data);
		log.info("-------");
	}

}
