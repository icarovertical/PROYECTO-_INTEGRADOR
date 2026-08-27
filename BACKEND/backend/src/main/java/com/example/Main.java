package com.example;

public class Main {
    public static void main(String[] args) {
        
        Product producto1 = new Product("001","Arroz", 15000.0, 100);
        Product producto2 = new Product("002","Leche", 25000.0, 250);

        //String p1Texto = producto1.toString(); // Aloja en String de Producto en una variable p1Texto
        //System.out.println("Producto1: "+ p1Texto); // Imprime por consola la varible p1Texto
        System.out.println("Producto1: "+ producto1.toString()); //Abrevia la recoleccion de toString y su impresion usando una variable ya declarada.
        System.out.println("Producto2: "+ producto2.toString()); //Abrevia la recoleccion de toString y su impresion usando una variable ya declarada.
      
    }
    
} 