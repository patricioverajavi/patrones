package com.decorator;

public class Client {

	public static void main(String[] args) {
		

		 Cuenta cuenta = new Cuenta(1,"Patricio Vera");
		 System.out.println("Esta cuenta es de: "+cuenta.cliente());
		 
		 //cuenta Ahorro
		 ICuentaBancaria cuentaAhorro= new CuentaAhorro() ;
			
			 ICuentaBancaria cuentaBlindaje = new BlindajeDecorator(cuentaAhorro);
			 
			 cuentaBlindaje.abrirCuenta(cuenta);		
		
			 System.out.println("---------------------");
			 //Cuenta Corriente
		 ICuentaBancaria cuentaCorriente= new CuentaCorriente();
		 ICuentaBancaria cuentaBlindajes = new BlindajeDecorator(cuentaCorriente);
			
		 cuentaBlindajes.abrirCuenta(cuenta);
			 
			 
	}

}
