package com.mitocode;

import java.util.concurrent.Executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
@EnableAsync
public class AppConfig {
	
	@Bean
	public Executor asyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(3); //inicial
		executor.setMaxPoolSize(3); //maximo
		executor.setQueueCapacity(500); //procesamientos en espera
		
		return executor;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AppConfig.class, args).close(); //es como un System.exit(0);
	}

}
