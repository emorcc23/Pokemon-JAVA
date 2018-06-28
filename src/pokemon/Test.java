/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Álvaro Santos
 */
public class Test {

    static ArrayList<Entrenador> listaEntrenadores = new ArrayList<>();
    static ArrayList<Pokemon> listaPokemon = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean salir = false;
        int opcion;

        Scanner entrada = new Scanner(System.in);

        while (!salir) {

            System.out.println("1. Registrar un entrenador");
            System.out.println("2. Registrar un pokemon");
            System.out.println("3. Hacer una batalla");
            System.out.println("4. Mejorar vida a un pokemon");
            System.out.println("5. Conseguir pociones de salud");
            System.out.println("6. Ver todos los entrenadores");
            System.out.println("7. Ver todos los pokemon");
            System.out.println("8. Ranking de los entrenadores");
            System.out.println("9. Ranking de las batallas");
            System.out.println("10. Salir\n\n");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Vamos a registrar un entrenador");
                    System.out.println("nombre");
                    String nombre = entrada.next();
                    System.out.println("Pokeballs");
                    int pokeballs = entrada.nextInt();
                    System.out.println("Pociones");
                    int pociones = entrada.nextInt();
                    Entrenador entrenador1 = new Entrenador(nombre, pokeballs, pociones);
                    listaEntrenadores.add(entrenador1);
                    System.out.println("\n \n Entreneador dado de alta");
                    break;
                case 2:
                    System.out.println("Vamos a registrar un pokemon");
                    System.out.println("nombre");
                    String nom = entrada.next();
                    System.out.println("Tipo");
                    System.out.println("1. "+TipoPokemon.AGUA);
                    System.out.println("2. "+TipoPokemon.AIRE);
                    System.out.println("3. "+TipoPokemon.FUEGO);
                    System.out.println("4. "+TipoPokemon.TIERRA);
                    int type = entrada.nextInt();
                    String tipo = "desconocido";
                    if (type == 1) {
                        tipo = "AGUA";
                    } else if (type == 2) {
                        tipo = "AIRE";
                    } else if (type == 3) {
                        tipo = "FUEGO";
                    } else if (type == 4) {
                        tipo = "TIERRA";
                    }
                    
                    System.out.println("Habilidad");
                    int habilidad = entrada.nextInt();
                    System.out.println("ataque");
                    int ataque = entrada.nextInt();
                    System.out.println("defensa");
                    int defensa = entrada.nextInt();
                    System.out.println("Velocidad");
                    int velocidad = entrada.nextInt();
                    System.out.println("Vida");
                    int vida = entrada.nextInt();
                    System.out.println("Entrenador");
                    String entrenador = entrada.next();
                    
                    Pokemon pokemon1 = new Pokemon(nom, tipo, habilidad, ataque, defensa, velocidad, vida);
                    pokemon1.setEntrenador(entrenador);
                    listaPokemon.add(pokemon1);
                    for (int i = 0; i < listaPokemon.size(); i++) {
                        System.out.println("nombre "+listaPokemon.get(i).getNombre());
                        System.out.println("tipo "+listaPokemon.get(i).getTipopokemon());
                        System.out.println("habilidad "+listaPokemon.get(i).getHabilidad());
                        System.out.println("ataque "+listaPokemon.get(i).getAtaque());
                        System.out.println("defensa "+listaPokemon.get(i).getDefensa());
                        System.out.println("velocidad "+listaPokemon.get(i).getVelocidad());
                        System.out.println("vida "+listaPokemon.get(i).getVida());
                        System.out.println("entrenador "+ listaPokemon.get(i).getEntrenador());
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    salir = true;
                    break;
                default:
                    System.out.println("No has pulsado una opción correcta\n\n.");

            }
        }

    }

    public static void mostrarEntrenadores() {
        for (int i = 0; i < listaEntrenadores.size(); i++) {
            System.out.println("\t\t Nombre: " + listaEntrenadores.get(i).getNombre());
            System.out.println("Pokeballs: " + listaEntrenadores.get(i).getPokeballs());
            System.out.println("Pociones: " + listaEntrenadores.get(i).getPociones());
            System.out.println("Nivel: " + listaEntrenadores.get(i).getNivel());
        }
    }

}
