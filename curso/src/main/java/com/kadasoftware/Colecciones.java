package com.kadasoftware;

import javafx.scene.layout.Priority;

import java.util.*;

/**
 * Created by kadalap04 on 3/05/17.
 */
public class Colecciones {

    public void probarColeccion() {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("nombre", "Ana");

        Persona persona = new Persona();
        persona.setNombre("Andres");

        Persona persona2 = new Persona();
        persona2.setNombre("Nancy");

        Map<Persona, String> mapaPersonas = new HashMap<>();

        mapaPersonas.put(persona, "hola");
        mapaPersonas.put(persona2, "otravez ");

       // System.out.println(mapaPersonas);

        mapaPersonas.forEach(
                (k,v) -> System.out.println("llave : " + k + " Valor : " + v) );
    }

    public void probarList() {
        List<String> list = new ArrayList();

        list.add("Bote");
        list.add("Taza");
        list.add("caja");

        list.removeIf(elemento -> Character.isLowerCase(elemento.charAt(0)));
        System.out.println(list);


    }

    public void probarSet() {

        Set<String> set = new HashSet<>();

        set.add("Bote");
        set.add("Taza");
        set.add("caja");
        set.add("Bota");
        set.add("canasta");
        set.add("canasta");

        for (String elemento : set ) {
            System.out.println(elemento);
        }

    }

    public void addLists(){
        Set<String> nombres = new HashSet<>();

        nombres.add("A");
        nombres.add("B");
        nombres.add("C");
        nombres.add("D");

        List<String> nombres2 = new ArrayList<>();

        //nombres2 = (List) nombres;

        System.out.println(nombres2);
        //nombres2.addAll(nombres);


    }

    public void converterFromListToSet(){


    }

    public void otroMapa() {

        Map<Persona, String> otroMapa = new TreeMap<>(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o2.getEdad() - o1.getEdad();
            }
        });

        otroMapa.put(new Persona("Luis", 50), "paraguas");
        otroMapa.put(new Persona("carlos", 23), "sombrilla");
        otroMapa.put(new Persona("Dania", 31), "vaso");

        System.out.println(otroMapa);
    }
}
