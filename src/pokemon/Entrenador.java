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
public class Entrenador {
    private String nombre;
    private int pokeballs;
    private int pociones = 0;
    private int puntos;
    private int nivel = 0;
    
    public Entrenador(String nombre, int pokeballs, int pociones, int puntos) {
        this.nombre = nombre;
        this.pokeballs = pokeballs;
        this.pociones = pociones;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPokeballs() {
        return pokeballs;
    }

    public void setPokeballs(int pokeballs) {
        this.pokeballs = pokeballs;
    }

    public int getPociones() {
        return pociones;
    }

    public void setPociones(int pociones) {
        this.pociones = pociones;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
}
