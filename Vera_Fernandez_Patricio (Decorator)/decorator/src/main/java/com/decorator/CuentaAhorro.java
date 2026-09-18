package com.decorator;

public final class CuentaAhorro implements ICuentaBancaria{

	@Override
	public void abrirCuenta(Cuenta cuenta) {
		System.out.println("Se abrio correctamente la cuenta de ahorro: "+cuenta.cliente());
		
	}

}
