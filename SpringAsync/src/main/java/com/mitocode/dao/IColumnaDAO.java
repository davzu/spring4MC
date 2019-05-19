package com.mitocode.dao;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface IColumnaDAO {

	public CompletableFuture<List<String>> getColumnasAsync();

	public List<String> getColumnas();

}
