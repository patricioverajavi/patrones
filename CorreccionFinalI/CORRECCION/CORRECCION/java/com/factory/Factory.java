package com.factory;

import java.util.HashMap;

import java.util.Map;

import com.anotacion.MiComponente;
import com.google.common.reflect.ClassPath;

public class Factory implements IFactory{

		private Map<String, Class> componente = new HashMap<String, Class>();
				

		@Override
		public void init(String pkgName) {
			System.out.println("inicia... ");
			try {
				ClassPath classPath = 
						ClassPath.from(Factory.class.getClassLoader());
				var clases = classPath.getTopLevelClassesRecursive(pkgName);
				System.out.println("inicia carga...");
				for (var it: clases) {
					var miComp = it.load().getAnnotation(MiComponente.class);
					if (miComp != null) {
						componente.put(miComp.name(), it.load());
					}
				}

			} catch(Exception e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public <T> T crear(String name) {
		
			var value = componente.get(name);
			if (value == null) {
				throw new RuntimeException("Componente " + name + " no es esta registrado");
			}
			try {
				var cto  = value.getConstructor();
				Object obj = cto.newInstance();
				return (T) obj;
				
			} catch (Exception e) {
				throw new RuntimeException(e);
			}	
		}

		public Map<String, Class> getComponente() {
			return componente;
		}

}
