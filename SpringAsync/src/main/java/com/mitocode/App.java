package com.mitocode;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mitocode.dao.IColumnaDAO;
import com.mitocode.dao.IFilaDAO;

@Component
public class App implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(App.class);
	@Autowired
	private IFilaDAO filaDAO;
	@Autowired
	private IColumnaDAO columnaDAO;

	@Override
	public void run(String... args) throws Exception {
		long inicio = System.currentTimeMillis();

//		filaDAO.getFilas();
//		columnaDAO.getColumnas();
		
		CompletableFuture<List<String>> future1 = filaDAO.getFilasAsync();
		CompletableFuture<List<String>> future2 = columnaDAO.getColumnasAsync();
		
		CompletableFuture.allOf(future1, future2).join();

		logger.info("Tiempo transcurrido: " + (System.currentTimeMillis() - inicio) / 1000);
		logger.info("--> " + future1.get());
		logger.info("-->" + future2.get());
	}

}
