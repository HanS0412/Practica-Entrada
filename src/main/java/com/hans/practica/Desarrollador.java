package com.hans.practica;

import java.util.List;

/**
 *
 * @author hponte
 */
public class Desarrollador extends Empleado implements EvaluacionDesempeno{

    private List<String> lenguajes;

    public Desarrollador(List<String> lenguajes, int id, String nombre, String departamento, float salario) {
        super(id, nombre, departamento, salario);
        this.lenguajes = lenguajes;
    }
    
    @Override
    public void calcularBono() {
        int cantidadLenguajes = lenguajes.size();
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
        System.out.println("Lenguajes: {");
        for(String l: getLenguajes()){
            System.out.println(" "+l);
        }
        System.out.println("}");
    }

    public List<String> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(List<String> lenguajes) {
        this.lenguajes = lenguajes;
    }

    @Override
    public String evaluarDesempeno(int cantidadLenguajes) {
        if(cantidadLenguajes < 2){
            return "MALO";
        }else if(cantidadLenguajes > 1 && cantidadLenguajes < 4){
            return "REGULAR";
        }else{
            return "BUENO";
        }
    }
    
}
