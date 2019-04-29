package com.mitocode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		IPersonaService service = (IPersonaService) context.getBean("personaService");
		Persona per = (Persona) context.getBean("persona");
		System.out.println(per.getId() + "-" + per.getNombres() + "-" + per.getApellidos());
		
		service.crear();
		
		//((ConfigurableApplicationContext)context).close();
	}
}
