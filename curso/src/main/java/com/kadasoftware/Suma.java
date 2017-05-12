package com.kadasoftware;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by AnaCeci on 11/05/17.
 */
public class Suma {

    private Integer[] numeros ;
    private int sumaNumeros = 0;

    public Suma(Integer[] numeros) {
        this.numeros = numeros;
    }

   public void ajustarNumeros() {
        Integer[] numeroComparador = numeros.clone();
       for (int i=0; i<numeroComparador.length ; i++) {
           for (int n=0; n<numeros.length; n++) {
               if (numeroComparador[i].equals(numeros[n]) && i!=n) numeros[n] = 0;
           }
       }
   }

   public void sumarNumeros() {
        for (int i=0;i < numeros.length; i++) {
            this.sumaNumeros += numeros[i];
        }

   }

    @Override
    public String toString() {
        return "Suma{" +
                "numeros=" + Arrays.toString(numeros) +
                '}';
    }

    public Integer[] getNumeros() {
        return numeros;
    }

    public void setNumeros(Integer[] numeros) {
        this.numeros = numeros;
    }

    public int getSumaNumeros() {
        return sumaNumeros;
    }

    public void setSumaNumeros(int sumaNumeros) {
        this.sumaNumeros = sumaNumeros;
    }
}
