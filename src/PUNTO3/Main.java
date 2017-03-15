/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO3;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ingrese la posicion del robot en el laberinto");
        System.out.println("Tenga en cuenta que es fila y columna, separados por enter");
        Laberinto laberinto = new Laberinto();
        laberinto.Escena1();
        laberinto.solucionarLaberinto();

    }
}
