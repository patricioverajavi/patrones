package com.model;

import java.util.ArrayList;
import java.util.List;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
public abstract class Personaje {
	protected String nombre;
    protected int nivel;
    protected int puntosDeVida;
    protected int ataque;
    protected int defensa;
    protected String habilidadesEspecilaes;
    protected List<String> inventario = new ArrayList<>();
    protected String TipoPlataforma;

    
    protected String plataforma;
    protected String calidadGrafica;
    protected String inteligenciaArtificial;
    
    public abstract void mostrarHabilidad();

}
 
