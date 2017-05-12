package com.kadasoftware;

/**
 * Created by kadalap04 on 11/05/17.
 */
public class Figura {

    private int maxNumero = 0;
    private String simbolo = "*";


    public void imprimeFiguraHorizontal(int numero) {
        imprimeArriba(numero);
//        imprimeAbajo(numero);
    }

    private void imprimeArriba(int maxNumero){
        for (int i=1; i<= maxNumero; i++) {
            int n = 0;
            String cadena = "*";
            while(n>=i) {
                cadena.concat(simbolo);
                n++;
            }
            System.out.println(cadena);
        }
    }

    private void imprimeAbajo(int maxNumero){
        for (int i=maxNumero; i>0; i--) {
            System.out.println("*");
        }
    }

    private int calculaMaximo(float numero) {
        return (int) Math.ceil(numero/2.0);
    }
}
