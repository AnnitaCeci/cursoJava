package com.kadasoftware;

/**
 * Created by kadalap04 on 5/05/17.
 */
public class Persona {
    private String nombre;
    private Integer edad;

    public Persona() {

    }

    public  Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }


    public void setEdad(Integer edad) {
        this.edad = edad;
    }
/*
    @Override
    public boolean equals(Object o) {
        return true;

    }

    @Override
    public int hashCode() {
        return 5;
    }*/

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
