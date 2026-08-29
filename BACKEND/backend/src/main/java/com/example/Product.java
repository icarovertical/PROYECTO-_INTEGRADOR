package com.example;

public class Product {
    // Atributos
    private String id;
    private String name;
    private Double price;
    private int stock;

    // Constructor Parametrizado
    public Product (String id, String name, Double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    //Getter y Setter
     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
   
   
    //
    @Override
    public String toString() {
        return  "Producto: [ID:"+ id + ", Name:" + name + ", Price:" + price + ", Stock:" + stock + "]";
    }

   
}
