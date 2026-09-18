package com.model;

import observer.Observer;
import strategy.TipoUser;

public class Usuario implements Observer{
	private String name;
	private TipoUser tipUser;
	public Usuario(String name, TipoUser tipUser) {
		this.name = name;
		this.tipUser = tipUser;
	}

	@Override
	public void notifyObservers(String mensaje) {
		System.out.println("user: "+ name + ", notify -> " + mensaje);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TipoUser getTipUser() {
		return tipUser;
	}

	public void setTipUser(TipoUser tipUser) {
		this.tipUser = tipUser;
	}
	
	

}
