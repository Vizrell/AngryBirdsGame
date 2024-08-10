package com.mycompany.angrybirdgame;

public class Pajaro {
    protected String nombre;
    protected String color;
    protected int fuerza;

    public Pajaro(String nombre, String color, int fuerza) {
        this.nombre = nombre;
        this.color = color;
        this.fuerza = fuerza;
    }

    public void lanzar() {
        System.out.println(nombre + " se lanza con fuerza " + fuerza + "!");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Color: " + color + ", Fuerza: " + fuerza);
    }
}