package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Created by usu26 on 19/09/2016.
 */

public class SeguridadSocial {

    private List<Persona> personaList;

    HashMap<String, Persona> HashMapDni;

    public SeguridadSocial(){

        personaList = new ArrayList<>();
        HashMapDni = new HashMap<>();
    }

    //Añadimos las personas dadas de alta, a la lista.
    public void altaPersona(Persona persona){

        personaList.add(persona);
    }

    //Creamos un if, para ir recorriendo toda la lista de personas con su dni,si se encuentra el dni de esa persona, se borra de la lista.
    public void bajaPersona(String dni){

        for(int i=0; i<personaList.size(); i++){
            if(personaList.get(i).getDni().equals(dni)){
                personaList.remove(i);
            }
        }
    }

    //Creamos un if, para ir recorriendo toda la lista de personas, y que nos devuelva el dni de dicha persona.
    public Persona obtenerPersonaDNI(String dni){

        for(int i=0; i<personaList.size(); i++){
            if(personaList.get(i).getDni().equals(dni)){
                return personaList.get(i);
            }
        }

        return null;
    }

    //Creamos un if, para ir recorriendo toda la lista de personas, y que nos devuelva el numero de SS de dicha persona.
    public Persona obtenerPersonaNumSS(String numSS){

        for(int i=0; i<personaList.size(); i++){
            if(personaList.get(i).getNumSS().equals(numSS)){
                return personaList.get(i);
            }
        }

        return null;
    }

    public List<Persona> obtenerPersonaRangoSalario(double min, double max){

       List<Persona> salarioPersonas = new ArrayList<>();

       for(int i=0; i<personaList.size(); i++ ){
         if(personaList.get(i).getSalario()>min || personaList.get(i).getSalario()<max){
                 salarioPersonas.add(personaList.get(i));
           }
       }
       return salarioPersonas;
   }

    public List<Persona> obtenerPersonasMayores(int edad){

        List<Persona> EdadPersonas = new ArrayList<>();

        for(int i=0; i<personaList.size(); i++){
            if(personaList.get(i).getSalario()>edad){
                EdadPersonas.add(personaList.get(i));
            }
        }

        return EdadPersonas;
    }

    public List<Persona>obtenerTodas(){

        return personaList;
    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personaList=" + personaList +
                '}';
    }
}
