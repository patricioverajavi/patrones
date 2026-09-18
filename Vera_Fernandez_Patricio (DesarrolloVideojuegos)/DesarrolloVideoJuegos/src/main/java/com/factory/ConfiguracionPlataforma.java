package com.factory;

public enum ConfiguracionPlataforma {
	PC("Alta","Difícil", 100, "Bajo", "60 FPS"),
	CONSOLAS("Baja", "Normal", 20, "Alto", "30 FPS"),
	DISPOSITIVOSMOVILES("Media", "Media", 50, "Medio", "60 FPS");
	

	public final String calidadGrafica;
    public final String dificultad;
    public final int cantidadEnemigos;
    public final String consumoMemoria;
    public final String velocidadAnimacion;

    ConfiguracionPlataforma(String calidad, String dificultad, int cantidad, 
    		String consumo, String velocidad) {
        this.calidadGrafica = calidad;
        this.dificultad = dificultad;
        this.cantidadEnemigos = cantidad;
        this.consumoMemoria = consumo;
        this.velocidadAnimacion = velocidad;

    }
}
