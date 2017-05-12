package com.kadasoftware;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );

        //Colecciones colecciones = new Colecciones();
        //colecciones.otroMapa();

        /*Cambio cambios = new Cambio();
        float nose = (float) 3.3;
        Integer[] nose2 = cambios.darCambio(nose);
        System.out.println(nose2.toString());*/



        /**
         * ejercicio FIZZBUZZ
         * AnaCeci
         */

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.generaFizzBuzz();
        System.out.println(fizzBuzz.toString());


        /**
         * ejercicio Sumas
         * AnaCeci
         */

        Suma suma = new Suma(new Integer[] {1,1,1,5,8,7,7,9 });
        System.out.println(suma.toString());
        suma.ajustarNumeros();
        suma.sumarNumeros();
        System.out.println("SUMA = " + suma.getSumaNumeros());

        /**
        * Ejercicio Mazo de Cartas
        */


        /**
         * Ejercicio Figura
         */

        Figura figura = new Figura();
        figura.imprimeFiguraHorizontal(5);


    }
}
