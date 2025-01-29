/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebacuentag4;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class PruebaCuentaG4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cuenta de ahorros");

        System.out.print("Ingrese saldo inicial: $");
        float saldoInicialAhorros = input.nextFloat();

        System.out.print("Ingrese tasa de interes: ");
        float tasaAhorros = input.nextFloat();

        CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);

        System.out.print("Ingresar cantidad a consignar: $");
        float cantidadDepositar = input.nextFloat();
        cuenta1.consignar(cantidadDepositar);

        System.out.print("Ingresar cantidad a retirar: $");
        float cantidadRetirar = input.nextFloat();
        cuenta1.retirar(cantidadRetirar);

        cuenta1.extractoMensual();
        cuenta1.imprimir();

        input.close();
    }
}
