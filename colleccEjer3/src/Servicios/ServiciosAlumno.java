
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosAlumno {
    private Scanner leer = new Scanner(System.in);
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public void crearAlumno(){
        String respuesta;
        do {
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = leer.next();
            System.out.println("Ingrese las notas del alumno: ");
            Integer[] notas = new Integer[3];
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Ingrese la nota " + (i + 1) + ": ");
                notas[i] = leer.nextInt();
            }
            alumnos.add(new Alumno(nombre, notas));
            
            do {
            System.out.println("Desea ingresar otro alumno? (s/n)");
            respuesta = leer.next();
            if (respuesta.equals("n") || respuesta.equals("s"))
                break;
            else
                System.out.println("Introduce una respuesta valida");
            } while (true);
        } while (respuesta.equals("s"));
    }

    public void notaFinal(){
        System.out.println("Ingrese el nombre del alumno para la nota final: ");
        String nombre = leer.next();
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(nombre)){
                System.out.println("La nota final del alumno es: " + calcularNotaFinal(alumno));
                break;
            }
        }
    }

    public Float calcularNotaFinal(Alumno alumno){
        float suma = 0;
        for (Integer nota : alumno.getNotas()) {
            suma += nota;
        }
        return (suma/alumno.getNotas().length);
    }
}
