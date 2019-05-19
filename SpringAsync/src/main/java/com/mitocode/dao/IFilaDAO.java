package com.mitocode.dao;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface IFilaDAO {
	
	public CompletableFuture<List<String>> getFilasAsync();
	
	public List<String> getFilas();

}
