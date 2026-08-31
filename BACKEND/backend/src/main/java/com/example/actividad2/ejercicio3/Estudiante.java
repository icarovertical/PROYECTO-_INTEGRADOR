package com.example.actividad2.ejercicio3;

public class Estudiante {
    private String nombre;
    private int edad;
    private Double promedio;

    
    public Estudiante (){
        this.nombre = "Carlos";
        this.edad = 20;
        this.promedio = 3.5;
    }
    
    public Estudiante (String nombre, int edad, Double promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Double getPromedio() {
        return promedio;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
           System.out.println("Edad inválida: La edad debe ser mayor a 0");
        }
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }


    public boolean haAprobado() {
        return promedio >= 3.0;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "edad: " + edad + "Promedio: " + promedio);
        if (haAprobado()) {
            System.out.println("Aprobado");
        } else {
            System.out.println("NO Aprobado");
        }
    }
}
