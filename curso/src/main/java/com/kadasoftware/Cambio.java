package com.kadasoftware;

import java.math.BigDecimal;
import java.util.Iterator;

/**
 * Created by kadalap04 on 10/05/17.
 */
public class Cambio {

    private BigDecimal PRECIO_PRODUCTO;

    BigDecimal[] denominaciones ={
            new BigDecimal(0.10),
            new BigDecimal(0.20),
            new BigDecimal(0.50),
            new BigDecimal(1.00)
    };

    Integer[] monedasDisponibles={
            new Integer( 10),
            new Integer( 10),
            new Integer( 10),
            new Integer( 10)
    };

    Integer[] cambioRecibido={
            new Integer( 0),
            new Integer( 0),
            new Integer( 0),
            new Integer( 0)
    };


    public Integer[] darCambio(float dineroIngresado){

        if(this.hayCambioDisponible(dineroIngresado)){

            PRECIO_PRODUCTO = new BigDecimal(dineroIngresado);
            int i = denominaciones.length;

            while(PRECIO_PRODUCTO.compareTo(BigDecimal.ZERO) > 0 && i > 0) {
                BigDecimal cantidadMaxima = denominaciones[i-1].multiply(new BigDecimal(monedasDisponibles[i-1]));
                int monedasIdeales = PRECIO_PRODUCTO.divide(denominaciones[i-1]).intValue();
                if(monedasIdeales > monedasDisponibles[i-1].intValue()){
                    cambioRecibido[i-1] = monedasDisponibles[i-1];
                    monedasDisponibles[i-1] = monedasDisponibles[i-1].intValue() - monedasDisponibles[i-1].intValue();
                }
                else{
                    cambioRecibido[i-1] = monedasIdeales;
                    monedasDisponibles[i-1] = monedasDisponibles[i-1].intValue() - monedasIdeales;
                }
                PRECIO_PRODUCTO = PRECIO_PRODUCTO.subtract(denominaciones[i-1].multiply(new BigDecimal(cambioRecibido[i-1])));
                System.out.println(PRECIO_PRODUCTO);
                i = i--;
            }
        }
        return cambioRecibido;
    }


    public boolean hayCambioDisponible(float dineroIngresado){
        boolean resultado = true;
        int i = denominaciones.length;
        BigDecimal cantidadDisponible = BigDecimal.ZERO;
        for(int j=0; j<i ; j++){
            cantidadDisponible = cantidadDisponible.add(denominaciones[j].multiply(new BigDecimal (monedasDisponibles[j])));
        }
        if(cantidadDisponible.compareTo(new BigDecimal(dineroIngresado)) <  0){
            resultado = false;
        }
        System.out.println(cantidadDisponible);
        return resultado;
    }
}
