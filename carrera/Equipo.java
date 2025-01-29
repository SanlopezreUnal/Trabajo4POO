/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebametodosabstractos;

/**
 *
 * @author USER
 */

import java.util.Vector;
import java.util.Scanner;

public class Equipo {
    private String nombre;
    private static double totalTiempo;
    private String pais;
    Vector<Ciclista> listaCiclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0;
        listaCiclistas = new Vector<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getPais() {
        return pais;
    }

    private void setPais(String pais) {
        this.pais = pais;
    }

    void anadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    void listarEquipo() {
        for (Ciclista c : listaCiclistas) {
            System.out.println(c.getNombre());
        }
    }

    void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        String nombreCiclista = sc.next();
        for (Ciclista c : listaCiclistas) {
            if (c.getNombre().equals(nombreCiclista)) {
                System.out.println(c.getNombre());
            }
        }
    }

    void calcularTotalTiempo() {
        for (Ciclista c : listaCiclistas) {
            totalTiempo += c.getTiempoAcumulado();
        }
    }

    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + pais);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
}
