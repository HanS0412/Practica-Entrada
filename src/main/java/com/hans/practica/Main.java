package com.hans.practica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hponte
 */
public class Main {

    public static void main(String[] args) {
        List<String> lenguajes1 = new ArrayList<>();
        lenguajes1= getLenguajes1();
        List<String> lenguajes2 = new ArrayList<>();
        lenguajes2= getLenguajes2();
        List<String> equipo1 = new ArrayList<>();
        equipo1 = getGrupo1();
        List<String> equipo2 = new ArrayList<>();
        equipo2 = getGrupo2();
        Empleado desa1 = new Desarrollador(lenguajes1, 1, "Hans", "Lima", 3000);
        Empleado desa2 = new Desarrollador(lenguajes2, 2, "Piero", "Lima", 3500);
        Empleado geren1 = new Gerente(equipo1, 1, "Sebastian", "Trujillo",6000);
        Empleado geren2 = new Gerente(equipo2, 2, "Rodrigo", "Ancash",7000);
        desa1.mostrarDetalles();
        desa1.calcularBono();
        desa2.mostrarDetalles();
        desa2.calcularBono();
        geren1.mostrarDetalles();
        geren1.calcularBono();
        geren2.mostrarDetalles();
        geren2.calcularBono();
    }
    
    public static List<String> getLenguajes1(){
        List<String> lenguajes = new ArrayList<>();
        lenguajes.add("JAVA");
        lenguajes.add("PHP");
        lenguajes.add("JAVASCRIPT");
        lenguajes.add("C++");
        return lenguajes;
    }
    public static List<String> getLenguajes2(){
        List<String> lenguajes = new ArrayList<>();
        lenguajes.add("JAVA");
        lenguajes.add("PHP");
        return lenguajes;
    }
    public static List<String> getGrupo1(){
        List<String> equipo = new ArrayList<>();
        equipo.add("Juan");
        equipo.add("Piero");
        equipo.add("Jorge");
        equipo.add("Karen");
        equipo.add("Leonardo");
        equipo.add("Dayana");
        equipo.add("Oscar");
        equipo.add("Alexis");
        return equipo;
    }
    public static List<String> getGrupo2(){
        List<String> equipo = new ArrayList<>();
        equipo.add("Oscar");
        equipo.add("Alexis");
        return equipo;
    }
}
