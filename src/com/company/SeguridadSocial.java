package com.company;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by usu26 on 19/09/2016.
 */

public class SeguridadSocial {

    private List<Persona> personaList;

    public SeguridadSocial(){

        personaList = new ArrayList<>();
    }

    public void altaPersona(Persona persona){

        personaList.add(persona);
    }

    public void bajaPersona(String dni){

        for(int i=0; i<personaList.size(); i++){
            if(personaList.get(i).getDni().equals(dni)){
                personaList.remove(i);
            }
        }
    }

    public Persona obtenerPersonaDNI(String dni){

        for(int i=0; i<personaList.size(); i++){
            if(personaList.get(i).getDni().equals(dni)){
                return personaList.get(i);
            }
        }

        return null;
    }

    public Persona obtenerPersonaNumSS(String numSS){

        for(int i=0; i<personaList.size(); i++){
            if(personaList.get(i).getNumSS().equals(numSS)){
                return personaList.get(i);
            }
        }

        return null;
    }

//    public List<Persona> obtenerPersonaRangoSalario(double min, double max){
//
//        List<Persona> salarioPersonas = new ArrayList<>();
//
//        for(int i=0; i<personaList.size(); i++ ){
//           if(personaList.get(i).getSalario()>min||personaList.get(i).getSalario()<max){
//                 //salarioPersonas.add();
//           }
//       }
//       //return salarioPersonas.add();
//    }

    public List<Persona> obtenerPersonasMayores(int edad){

        return null;

    }

    public List<Persona>obtenerTodas(){

        return null;
    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personaList=" + personaList +
                '}';
    }
}
