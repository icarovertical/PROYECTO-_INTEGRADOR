package com.example.actividad2.ejercicio2;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("El deposito debe ser mayor a 0.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("El retiro debe ser mayor a 0.");
        } else if (cantidad > saldo) {
            System.out.println("Saldo insuficiente. Saldo actual: " + saldo);
        } else {
            saldo -= cantidad;
        }
    }
//Prueba de GitHUB 4
    public void mostrarDetalles() {
        System.out.println("Titular: [" + titular + "] | Saldo: [" + saldo + "]");
    }
}
