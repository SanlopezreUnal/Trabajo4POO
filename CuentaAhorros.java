/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebacuentag4;

/**
 *
 * @author USER
 */
public class CuentaAhorros extends Cuenta {
    private boolean activa;

    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        activa = saldo >= 10000;
    }

    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        }
    }

    @Override
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        }
        if (saldo >= 10000) {
            activa = true;
        }
    }

    @Override
    public void extractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        if (saldo < 10000) {
            activa = false;
        }
    }

    public void imprimir() {
        System.out.println("Saldo = $" + saldo);
        System.out.println("Comision mensual = $" + comisionMensual);
        System.out.println("Numero de transacciones = " + (numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
}

