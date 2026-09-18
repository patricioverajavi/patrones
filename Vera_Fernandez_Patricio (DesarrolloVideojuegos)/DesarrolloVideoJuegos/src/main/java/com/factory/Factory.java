package com.factory;

public interface Factory {

	void init(String pkgName);
	<T>T crear(String names);
	
}
