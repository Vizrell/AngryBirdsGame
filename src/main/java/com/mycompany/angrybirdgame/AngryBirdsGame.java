/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.angrybirdgame;

/**
 *
 * @author COMGAMER
 */
public class AngryBirdsGame {
public static void main(String[] args) {
        // Crear instancias de los diferentes pájaros
        Red red = new Red(10);
        Chuck chuck = new Chuck(8);
        Bomb bomb = new Bomb(15);

        // Organizar en un arreglo
        Pajaro[] pajaros = {red, chuck, bomb};

        // Mostrar información y usar métodos
        for (Pajaro pajaro : pajaros) {
            pajaro.mostrarInformacion();
            pajaro.lanzar();

            if (pajaro instanceof Red) {
                ((Red) pajaro).ataqueEspecial();
            } else if (pajaro instanceof Chuck) {
                ((Chuck) pajaro).ataqueEspecial();
            } else if (pajaro instanceof Bomb) {
                ((Bomb) pajaro).ataqueEspecial();
            }

            System.out.println();
        }
    }
}