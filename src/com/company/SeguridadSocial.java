package com.company;

import java.util.*;
import java.util.stream.Collectors;


/**
 * Created by usu26 on 19/09/2016.
 */

public class SeguridadSocial {

    private List<Persona> personaList;

    private HashMap<String, Persona> HashMapDni;
    private HashMap<String, Persona> HashMapSSnum;

    public SeguridadSocial(){

        personaList = new ArrayList<>();
        HashMapDni = new HashMap<>();
        HashMapSSnum = new HashMap<>();
    }

    //Añadimos las personas dadas de alta, a la lista.
    public void altaPersona(Persona persona){

        boolean repetida = personaList.stream().anyMatch(p -> p.getDni().equals(persona.getDni())
                || p.getNumSS().equals(persona.getNumSS()));

        if(!repetida){
            HashMapDni.put(persona.getDni(), persona);
            HashMapSSnum.put(persona.getNumSS(), persona);
        }



        //personaList.add(persona);
    }

    //Creamos un if, para ir recorriendo toda la lista de personas con su dni,si se encuentra el dni de esa persona, se borra de la lista.
    public void bajaPersona(String dni){

        /*for(int i=0; i<personaList.size(); i++){
            if(personaList.get(i).getDni().equals(dni)){
                personaList.remove(i);
            }
        }*/
        //hashmap dni
        HashMapDni.remove(dni);
    }

    //Creamos un if, para ir recorriendo toda la lista de personas, y que nos devuelva el dni de dicha persona.
    public Persona obtenerPersonaDNI(String dni){

        /*for(int i=0; i<personaList.size(); i++){
            if(personaList.get(i).getDni().equals(dni)){
                return personaList.get(i);
            }
        }

        return null;*/

        //hashmap dni
        return HashMapDni.get(dni);
    }

    //Creamos un if, para ir recorriendo toda la lista de personas, y que nos devuelva el numero de SS de dicha persona.
    public Persona obtenerPersonaNumSS(String numSS){

        /*for(int i=0; i<personaList.size(); i++){
            if(personaList.get(i).getNumSS().equals(numSS)){
                return personaList.get(i);
            }
        }

        return null;*/

        //hashmap SSnum
        return HashMapSSnum.get(numSS);
    }

    public List<Persona> obtenerPersonaRangoSalario(double min, double max){

       /*List<Persona> salarioPersonas = new ArrayList<>();

       for(int i=0; i<personaList.size(); i++ ){
         if(personaList.get(i).getSalario()>min || personaList.get(i).getSalario()<max){
                 salarioPersonas.add(personaList.get(i));
           }
       }
       return salarioPersonas;*/

        //hashmap dni --> coje los valores de flujo del hashmap de dni
        return HashMapDni.values().stream().filter(persona -> persona.getSalario() > min && persona.getSalario() < max).collect(Collectors.toList());
   }

    public Collection<Persona> obtenerPersonasMayores(int edad){

        /*List<Persona> EdadPersonas = new ArrayList<>();

        for(int i=0; i<personaList.size(); i++){
            if(personaList.get(i).getSalario()>edad){
                EdadPersonas.add(personaList.get(i));
            }
        }

        return EdadPersonas;*/
        //con hashmap
        return HashMapDni.values().stream().filter(persona -> persona.getEdad() > edad).collect(Collectors.toList());
    }

    public Collection<Persona>obtenerTodas(){

        //return personaList;

        //hashmap dni
        return HashMapDni.values();
    }

    public void obtenerSalarioMaximo(){
      /*double max = Double.MIN_VALUE;
        Persona p = new Persona();
        for(int i=0; i<personaList.size(); i++){
            Persona p = personaList.get(i);
            if(p.getSalario() > max){
                max = p.getSalario();
                return p;
            }
        }*/

        //hashmap dni
        HashMapDni.values().stream().max(Comparator.comparing(Persona::getSalario)).ifPresent(maxInt -> System.out.println("El salario máximo es "+maxInt));
    }

    public void obtenerSalarioMinimo(){
        /*double min = Double.MAX_VALUE;
          Persona p = new Persona();
        for(int i=0; i<personaList.size(); i++){
            Persona p = personaList.get(i);
            if(p.getSalario() > min){
                max = p.getSalario();
                return p;
            }
        }*/

        //hashmap dni
        HashMapDni.values().stream().min(Comparator.comparing(Persona::getSalario)).ifPresent(min -> System.out.println("El salario mínimo es "+min));
    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personaList=" + personaList +
                '}';
    }
}
