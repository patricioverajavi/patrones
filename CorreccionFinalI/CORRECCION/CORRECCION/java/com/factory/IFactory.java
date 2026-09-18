package com.factory;

public interface IFactory {
	void init(String pkgName);
	<T> T crear (String name);

}
