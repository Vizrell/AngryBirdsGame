package com.mycompany.angrybirdgame;


import com.mycompany.angrybirdgame.Pajaro;

public class Bomb extends Pajaro {
    public Bomb(int fuerza) {
        super("Bomb", "Negro", fuerza);
    }

    public void ataqueEspecial() {
        System.out.println(nombre + " usa su ataque especial: Explosión!");
    }
}