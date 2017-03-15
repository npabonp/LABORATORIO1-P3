/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java. util. Scanner;

public class Laberinto {
    Scanner teclado = new Scanner (System. in);
    City city = new City();
    
/**
 * La direccion en la que estará el robot al iniciar el recorrido
 * será ingresada por el usuario, permitiendo que sin importar el
 * tamaño del laberinto, el Robot logre encontrar la salida.
 */
    int a = teclado. nextInt();
    int b = teclado. nextInt();
    Robot karel = new Robot(city, a, b, Direction.NORTH, 0);
    
    
    public void girarDerecha() {
        for (int i = 0; i < 3; i++) {
            karel.turnLeft();
            }
    }
    /** El objetivo del robot es recoger la pelota ubicada al
     * final del laberinto, para lo cual deberá resolver el mismo.
     * 
     * Empezará girando a la derecha y avanzando si no hay ningun
     * obstaculo, en caso de que lo haya, girará hacia la izquierda
     * hasta que su camino esté libre.
     * 
     *El robot finalizará su recorrido cuando su objetivo (recoger
     * la pelota) se pueda llevar a cabo, es decir, cuando recoja
     * la pelota ubicada al final del laberinto.
     * 
     */ 
    
    public void solucionarLaberinto() {
        while (!karel.canPickThing()) {
            girarDerecha();
            while (!karel.frontIsClear()) {
                karel.turnLeft();
            }
            karel.move();
        }
        if (karel.canPickThing()) {
            karel.pickThing();
        }
    }
/**
 * Esta escena es un caso hipotetico en donde se puede observar
 * cómo el Robot soluciona el laberinto, y mas importante aún, 
 * que el robot es capaz de solucionar cualquier escenario, que
 * claro, tenga una salida.
 * 
 * Hay que tener en cuenta, que la posicion de inicio ideal para 
 * solucionar este laberinto es en (9,0)
 */
    public void Escena1() {
        for (int i = 1; i < 10; i++) {
            Wall paredd0 = new Wall(city, i, 9, Direction.EAST);
        }

        for (int i = 0; i < 10; i++) {
            Wall paredvi = new Wall(city, i, 0, Direction.WEST);
            Wall paredh0 = new Wall(city, 0, i, Direction.NORTH);
            Wall pareda0 = new Wall(city, 9, i, Direction.SOUTH);
        }
        Thing balon = new Thing(city, 0, 10);

        Wall paredh0 = new Wall(city, 9, 1, Direction.NORTH);
        Wall paredh1 = new Wall(city, 8, 1, Direction.NORTH);
        Wall paredh2 = new Wall(city, 8, 2, Direction.NORTH);
        Wall paredh3 = new Wall(city, 5, 0, Direction.NORTH);
        for (int i = 1; i < 5; i++) {
            Wall paredh = new Wall(city, 3, i, Direction.NORTH);
        }
        for (int i = 3; i < 6; i++) {
            Wall paredh = new Wall(city, 4, i, Direction.NORTH);
        }
        for (int i = 2; i < 7; i++) {
            Wall paredh = new Wall(city, 5, i, Direction.NORTH);
        }
        for (int i = 2; i < 4; i++) {
            Wall paredh = new Wall(city, 6, i, Direction.NORTH);
        }
        for (int i = 0; i < 9; i++) {
            Wall paredh = new Wall(city, 2, i, Direction.NORTH);
        }
        for (int i = 1; i < 10; i++) {
            Wall paredh = new Wall(city, 1, i, Direction.NORTH);
        }
        Wall paredh4 = new Wall(city, 7, 4, Direction.NORTH);
        Wall paredh5 = new Wall(city, 8, 5, Direction.NORTH);
        for (int i = 3; i < 7; i++) {
            Wall paredh = new Wall(city, 9, i, Direction.NORTH);
        }
        Wall paredh6 = new Wall(city, 7, 6, Direction.NORTH);
        Wall paredh7 = new Wall(city, 7, 7, Direction.NORTH);
        Wall paredh8 = new Wall(city, 6, 9, Direction.NORTH);

        Wall paredv0 = new Wall(city, 8, 1, Direction.EAST);
        for (int i = 5; i < 8; i++) {
            Wall paredv = new Wall(city, i, 0, Direction.EAST);
        }
        Wall paredv1 = new Wall(city, 3, 0, Direction.EAST);
        for (int i = 3; i < 7; i++) {
            Wall paredv = new Wall(city, i, 1, Direction.EAST);
        }
        Wall paredv2 = new Wall(city, 7, 2, Direction.EAST);
        Wall paredv3 = new Wall(city, 7, 3, Direction.EAST);
        Wall paredv4 = new Wall(city, 8, 3, Direction.EAST);
        Wall paredv5 = new Wall(city, 5, 4, Direction.EAST);
        Wall paredv6 = new Wall(city, 6, 4, Direction.EAST);
        Wall paredv7 = new Wall(city, 2, 5, Direction.EAST);
        Wall paredv8 = new Wall(city, 3, 5, Direction.EAST);
        Wall paredv9 = new Wall(city, 6, 5, Direction.EAST);
        Wall paredv10 = new Wall(city, 7, 5, Direction.EAST);
        Wall paredv11 = new Wall(city, 8, 6, Direction.EAST);
        Wall paredV12 = new Wall(city, 9, 6, Direction.EAST);
        for (int i = 3; i < 6; i++) {
            Wall paredV = new Wall(city, i, 6, Direction.EAST);
        }
        for (int i = 2; i < 9; i++) {
            Wall paredV = new Wall(city, i, 7, Direction.EAST);
        }
        for (int i = 6; i < 9; i++) {
            Wall paredV = new Wall(city, i, 8, Direction.EAST);
        }
        for (int i = 2; i < 5; i++) {
            Wall paredV = new Wall(city, i, 8, Direction.EAST);
        }

    }
}
