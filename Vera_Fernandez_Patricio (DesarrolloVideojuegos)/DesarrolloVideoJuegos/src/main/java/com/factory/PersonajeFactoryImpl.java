package com.factory;

import java.util.ArrayList;

import com.model.Arquero;
import com.model.Enemigo;
import com.model.Guerrero;
import com.model.Mago;

public class PersonajeFactoryImpl implements IFactory {

	@Override
	public <T> T crear(String tipoPersonaje) {
		Object res=null;
		switch(tipoPersonaje) {
		case "guerrero":
			res=new Guerrero();
			break;
		case "mago":
			res=new Mago();
			break;
		case "arquero":
			res=new Arquero();
			break;
		case "enemigo":
			res=new Enemigo("Geman", 56, "Maestro", "PC");
			break;
		case "jefeFinal":
			res=new JefeFinal();
			break;	
		}
		return (T)res;
	}

}
