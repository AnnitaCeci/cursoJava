package com.kadasoftware;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by AnaCeci on 11/05/17.
 */
public class FizzBuzz {

    private String[] numerosFizzBuzz = new String[100];
    private int TRES = 3;
    private int CINCO = 5;

    public void generaFizzBuzz() {

        for (int cuenta = 0, numero = 1 ; cuenta < 100 ; cuenta++, numero++ ) {

            numerosFizzBuzz[cuenta] = "";

            if(numero%TRES == 0) {
                numerosFizzBuzz[cuenta] = numerosFizzBuzz[cuenta].concat("FIZZ");
            }

            if(numero%CINCO == 0) {
                numerosFizzBuzz[cuenta] = numerosFizzBuzz[cuenta].concat("BUZZ");
            }

            if (numerosFizzBuzz[cuenta].equals("")) {
                numerosFizzBuzz[cuenta] = String.valueOf(numero);
            }

        }

    }

    @Override
    public String toString() {
        return "FizzBuzz{" +
                "numerosFizzBuzz=" + Arrays.toString(numerosFizzBuzz) +
                '}';
    }

    public String[] getNumerosFizzBuzz() {
        return numerosFizzBuzz;
    }

    public void setNumerosFizzBuzz(String[] numerosFizzBuzz) {
        this.numerosFizzBuzz = numerosFizzBuzz;
    }
}
