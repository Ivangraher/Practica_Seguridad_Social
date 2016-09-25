package com.company;

public class Main {

    public static void main(String[] args) {

    SeguridadSocial seguridadSocial = new SeguridadSocial();

        //Creación de las diferentes personas

        Persona jose = new Persona("39425364H", "111111111", "Jose", "Tomas", 35, 45000.00);
        Persona maria = new Persona("39425654W", "33333333", "Maria", "Gallego", 55, 61300.20);
        Persona carlos = new Persona("39425355Q", "22222222", "Carlos", "Torres", 22, 23000.00);
        Persona anna = new Persona("39425987J", "444444444", "Anna", "Pina", 26, 17654.88);


        seguridadSocial.altaPersona(jose);
        seguridadSocial.altaPersona(maria);
        seguridadSocial.altaPersona(carlos);
        seguridadSocial.altaPersona(anna);

        System.out.println("Altas a la seguridad social: " + seguridadSocial.obtenerTodas());

        System.out.println("Baja a la seguridad social: " + anna.toString());

        seguridadSocial.bajaPersona(anna.getDni());

        System.out.println("Lista de afiliados a la S.S.: "+ seguridadSocial.obtenerTodas());

        System.out.println("obtenerPersonaPorDNI: "+ seguridadSocial.obtenerPersonaDNI(jose.getDni().toString()));

        System.out.println("obtenerPersonaPorNumSS: " +

                seguridadSocial.obtenerPersonaNumSS(maria.getNumSS()));

        System.out.println("obtenerPersonasRangoSalarial: " +

                seguridadSocial.obtenerPersonaRangoSalario(23000.00, 45000.00));

        System.out.println("obtenerPersonasMayores: "+ seguridadSocial.obtenerPersonasMayores(25));

        seguridadSocial.obtenerSalarioMaximo();

        seguridadSocial.obtenerSalarioMinimo();


    }
}
