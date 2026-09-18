package com.factory;

	import java.util.HashMap;
	import java.util.Map;
	import com.anotacion.MiComponente;
	import com.google.common.reflect.ClassPath;

	public class FactoryGen implements Factory {
	    
	    
	    private final Map<String, Class<?>> componentes = new HashMap<>();

	    @Override
	    public void init(String pkgName) {
	        System.out.println("Iniciando escaneo de componentes en: " + pkgName);
	        try {
	            ClassPath classPath = ClassPath.from(FactoryGen.class.getClassLoader());
	            var clases = classPath.getTopLevelClassesRecursive(pkgName);
	            
	            for (var infoClase : clases) {
	         
	                Class<?> clase = infoClase.load();
	                var miComp = clase.getAnnotation(MiComponente.class);
	                
	                if (miComp != null) {
	                    componentes.put(miComp.name(), clase);
	                    System.out.println("Registrado: [" + miComp.name() + "] -> " + clase.getSimpleName());
	                }
	            }
	            System.out.println("Carga de componentes finalizada. Total: " + componentes.size());
	        } catch (Exception e) {
	           
	            throw new RuntimeException("Error al inicializar FactoryGen: " + e.getMessage(), e);
	        }
	    }

	    @Override
	    @SuppressWarnings("unchecked") 
	    public <T> T crear(String name) {
	        var claseComponente = componentes.get(name);
	        
	        if (claseComponente == null) {
	            throw new RuntimeException("El componente '" + name + "' no está registrado en el sistema.");
	        }
	        
	        try {
	           
	            return (T) claseComponente.getDeclaredConstructor().newInstance();
	        } catch (Exception e) {
	            throw new RuntimeException("No se pudo instanciar el componente '" + name + "'. Verifique el constructor vacío.", e);
	        }
	    }
	}