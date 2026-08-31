package com.example.actividad2.ejercicio1;

/**
 * Libro
 */
public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    
    //Constructor 3 inicializador
    public Libro (String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    //Constructor 2
    public Libro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = 0;
    }
    
    //Constructor 1
    public Libro () {
        this.titulo = "Desconocido";
        this.autor = "Anonimo";
        this.paginas = 0;
    }
// Prueba 7
    public void mostrarDetalles() {
        System.out.println("Libro: [" + titulo + "] | Autor: [" + autor + "] | Paginas: [" + paginas + "]");
    }

}