package com.mitocode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;
import com.mitocode.service.PersonaServiceImpl;

public class App {
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		IPersonaService service = (IPersonaService)context.getBean(PersonaServiceImpl.class);
		
		service.create(new Persona(1,"Mito","Code"));
	}

}
