package com.decorator;

public sealed interface ICuentaBancaria permits CuentaAhorro, CuentaCorriente, CuentaDecorator{
	
	void  abrirCuenta(Cuenta cuenta);
		
	}


