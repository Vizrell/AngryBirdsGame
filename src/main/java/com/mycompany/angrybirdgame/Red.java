package com.mycompany.angrybirdgame;


import com.mycompany.angrybirdgame.Pajaro;

public class Red extends Pajaro {
    public Red(int fuerza) {
        super("Red", "Rojo", fuerza);
    }

    public void ataqueEspecial() {
        System.out.println(nombre + " usa su ataque especial: Aumentar su velocidad!");
    }
}