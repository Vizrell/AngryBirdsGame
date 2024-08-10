package com.mycompany.angrybirdgame;


import com.mycompany.angrybirdgame.Pajaro;

public class Chuck extends Pajaro {
    public Chuck(int fuerza) {
        super("Chuck", "Amarillo", fuerza);
    }

    public void ataqueEspecial() {
        System.out.println(nombre + " usa su ataque especial: Velocidad extrema!");
    }
}