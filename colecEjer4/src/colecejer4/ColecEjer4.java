
package colecejer4;

import Servicio.ServicioPelicula;


public class ColecEjer4 {

    
    public static void main(String[] args) {
        ServicioPelicula servPeli= new ServicioPelicula();
        servPeli.crearPelicula();
        servPeli.mostrarPeliculas();
        servPeli.mostrarPeliculaDuracion(1);
        servPeli.ordenarPeliculasDuracion(Boolean.TRUE);
        servPeli.mostrarPeliculas();
        servPeli.ordenarPeliculasDuracion(false);
        servPeli.mostrarPeliculas();
        servPeli.ordenarPeliculasTitulo();
        servPeli.mostrarPeliculas();
        servPeli.ordenarPeliculaDirector();
        servPeli.mostrarPeliculas();
        
    }
    
}
