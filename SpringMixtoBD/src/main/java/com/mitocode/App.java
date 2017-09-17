package com.mitocode;

import java.util.List;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;
import com.mitocode.service.PersonaServiceImpl;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		IPersonaService service = (IPersonaService) context.getBean(PersonaServiceImpl.class);
		App app = new App();
		
		app.listAll(service);
	}
	
	private void create(IPersonaService service){
		service.create(new Persona(1,"Maria","Linares"));
	}
	
	private void update(IPersonaService service){
		service.update(new Persona(14,"Esteba", "Carranza"));
	}
	
	private void listAll(IPersonaService service){
		List<Persona> lstPersona = service.listAll();
		for (Persona persona : lstPersona) {
			System.out.println("Id: " + persona.getId());
			System.out.println("Nombres: " + persona.getNombres());
			System.out.println("Apellidos: " + persona.getApellidos());
		}
	}
	
	private void find(IPersonaService service) {
		Persona persona = service.find(4);
		System.out.println("Nombres: " + persona.getNombres());
		System.out.println("Apellidos: " + persona.getApellidos());
	}
	
	private void delete(IPersonaService service){
		service.delete(15);
	}

}
