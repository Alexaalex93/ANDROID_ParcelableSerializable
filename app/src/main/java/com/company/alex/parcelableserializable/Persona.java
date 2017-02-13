package com.company.alex.parcelableserializable;

import java.io.Serializable;

/**
 * Created by Alex on 13/02/2017.
 */

public class Persona implements Serializable /* Para poder enviar objetos en un intent */{

    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return this.nombre + this.edad;
    }
}
