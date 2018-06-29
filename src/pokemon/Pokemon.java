/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author Álvaro Santos
 */
public class Pokemon {
    private String nombre;
    private TipoPokemon tipopokemon;
    private int habilidad;
    private int ataque;
    private int defensa;
    private int velocidad;
    private int vida;
    private int nivel = 0;
    private String entrenador;

    public Pokemon(String nombre, String tipopokemon, int habilidad, int ataque, int defensa, int velocidad, int vida) {
        this.nombre = nombre;
        this.tipopokemon = TipoPokemon.valueOf(tipopokemon);
        this.habilidad = habilidad;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoPokemon getTipopokemon() {
        return tipopokemon;
    }

    public void setTipopokemon(TipoPokemon tipopokemon) {
        this.tipopokemon = tipopokemon;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    

}