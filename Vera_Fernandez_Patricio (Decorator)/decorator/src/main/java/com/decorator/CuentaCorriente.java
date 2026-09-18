package com.decorator;

public final class CuentaCorriente implements ICuentaBancaria{

	@Override
	public void abrirCuenta(Cuenta cuenta) {
		
		System.out.println("Se abrio correctamente la cuenta corriente: "+cuenta.cliente());
		
	}

}
