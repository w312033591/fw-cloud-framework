package com.github.liuweijw.system.gateway;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FwGatewayApplication.class)
public class FwGatewayApplicationTest {

	@Autowired
	private StringEncryptor	stringEncryptor;

	@Test
	public void testEnvironmentProperties() {
	}

}
