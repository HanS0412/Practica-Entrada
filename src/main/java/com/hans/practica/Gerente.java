package com.hans.practica;

import java.util.List;

/**
 *
 * @author hponte
 */
public class Gerente extends Empleado implements EvaluacionDesempeno{

    private List<String> equipo;

    public Gerente(List<String> equipo, int id, String nombre, String departamento, float salario) {
        super(id, nombre, departamento, salario);
        this.equipo = equipo;
    }
    
    @Override
    public void calcularBono() {
        int cantidadLenguajes = equipo.size();
        float bono;
        String desempenio = evaluarDesempeno(cantidadLenguajes);
        if(desempenio.equals("MALO")){
            bono = 0;
        }else if(desempenio.equals("REGULAR")){
            bono = (float) (0.5*getSalario());
        }else{
            bono = (float) (1.5*getSalario());
        }
        System.out.println("Desempenio :"+desempenio);
        System.out.println("Bono: S/."+bono);
    }
    
    
    @Override
    public void mostrarDetalles(){
        System.out.println("############################");
        System.out.println("ID USUARIO: "+getId());
        System.out.println("NOMBRE: "+getNombre());
        System.out.println("DEPARTAMENTO: "+getDepartamento());
        System.out.println("SALARIO: S/."+getSalario());
        System.out.println("Equipo: {");
        for(String e: getEquipo()){
            System.out.println(" "+e);
        }
        System.out.println("}");
    }

    public List<String> getEquipo() {
        return equipo;
    }

    public void setEquipo(List<String> equipo) {
        this.equipo = equipo;
    }

    @Override
    public String evaluarDesempeno(int i) {
        if(i < 3){
            return "MALO";
        }else if(i > 3 && i < 6){
            return "REGULAR";
        }else{
            return "BUENO";
        }
    }
    
    
    
    
}
