package com.decorator;

public  abstract sealed class CuentaDecorator implements ICuentaBancaria permits BlindajeDecorator{
	
	protected  ICuentaBancaria cuentaDecorator;
	
	public CuentaDecorator(ICuentaBancaria cuentaDecorator) {
	
		this.cuentaDecorator=cuentaDecorator;
	}
    @Override
	public void abrirCuenta(Cuenta cuenta) {
    	cuentaDecorator.abrirCuenta(cuenta);
	}

}
