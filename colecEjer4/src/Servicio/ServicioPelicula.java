
package Servicio;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class ServicioPelicula {
 Scanner leer=new Scanner(System.in);
 ArrayList<Pelicula> peliculas=new ArrayList<Pelicula>();
 
 
 public void crearPelicula(){
     String respuesta;
     do {
         System.out.println("Ingrese ell nombre de la pelicula;");
         String nombre=leer.nextLine();
         System.out.println("Ingrese eldirector;");
         String director=leer.nextLine();
         System.out.println("Imgrese la duracion ;");
         Float duracion=Float.parseFloat(leer.nextLine());
         peliculas.add(new Pelicula(nombre,director,duracion));
         while (true){
             System.out.println("Desea ingresar una nueva pelicua:? (s/n)");
             respuesta=leer.nextLine();
             if (respuesta.equals("s")|| respuesta.equals("n")){
                 break;
                 
             }else{
                 System.out.println("Ingrese una respuesta valida");
             }
         }        
     }while (!respuesta.equals("n"));
     
     }
 public void mostrarPeliculas(){
     System.out.println("\nMostrando todas las peliculas");
     for (Pelicula pelicula : peliculas) {
         System.out.println("Titulo:" + pelicula.getTitulo()+ "Director:" + pelicula.getDirector()+ "Duracion:" + pelicula.getDuracion());
         
     }
 }
 public void mostrarPeliculaDuracion(int duracion){
     System.out.println("\nPeliculas con duracion mayor a: " + duracion + "horas:");
     for (Pelicula pelicula : peliculas) {
         if(pelicula.getDuracion()> duracion){
             System.out.println("Titulo:" + pelicula.getTitulo() + "Director:" + pelicula.getDirector()+ "Duracion:" + pelicula.getDuracion());
         }   
     }
 }
     
 public void ordenarPeliculasDuracion(Boolean ascendente){
     if (ascendente){
         System.out.println("\nPeliculas ordenadas por duracion ascendente");
     }else {
         System.out.println("\nPeliculas ordenadas por duracion descendente");
     }
     Collections.sort(peliculas,new Comparator<Pelicula>() {
         @Override
         public int compare(Pelicula t, Pelicula t1) {
              if (ascendente){
                  return t.getDuracion().compareTo(t1.getDuracion());
              }else{
                  return t1.getDuracion().compareTo(t.getDuracion());
                  
              }
        }
         
    });
 }
 public void ordenarPeliculasTitulo(){
     System.out.println("\nPeliculas ordenadas por titilo ");
     Collections.sort(peliculas, new Comparator<Pelicula>() {
         @Override
         public int compare(Pelicula t, Pelicula t1) {
              return t.getTitulo().compareTo(t1.getTitulo());
              
         }
     });
 }
 
 public void ordenarPeliculaDirector(){
     System.out.println("\nPeliculas ordenadas por Director:");
     Collections.sort(peliculas, new Comparator<Pelicula>() {
         @Override
         public int compare(Pelicula t, Pelicula t1) {
              return t.getDirector().compareTo(t1.getDirector());
              
         }
     });
 }
}
