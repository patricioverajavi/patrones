package com.decorator;

public final  class BlindajeDecorator extends CuentaDecorator {

	public BlindajeDecorator(ICuentaBancaria cuentaDecorador) {
		super(cuentaDecorador);
		// TODO Auto-generated constructor stub
	}
	   @Override
	   
	   public void abrirCuenta(Cuenta cuenta) {
		   super.abrirCuenta(cuenta);
		   agregarBlindaje(cuenta);
		   
	   }
	   private void agregarBlindaje(Cuenta cuenta) {
		   System.out.println("Se agregó blindaje a su cuenta: "+ cuenta.cliente());
		   
	   }
	
	

}
