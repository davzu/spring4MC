package com.mitocode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Persona per = (Persona) context.getBean("persona");
		IPersonaService service = (IPersonaService) context.getBean("personaService");
		System.out.println(per.toString());
		service.crear();
		context.close();
	}

}
