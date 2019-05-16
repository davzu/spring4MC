package com.mitocode.SpringBootApplication;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
	
	@Autowired
	private BCryptPasswordEncoder bCryptEncoder;

	@Test
	public void test() {
		String antes = "mitocode";
		String despues = bCryptEncoder.encode("mitocode");
		
		assertFalse(antes.equalsIgnoreCase(despues));
	}

}
