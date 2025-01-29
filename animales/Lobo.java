/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author USER
 */
public abstract class Lobo extends Canido {
    public String getSonido() {
        return "Aullido";
    }

    @Override
    public String getAlimentos() {
        return "Carnívoro";
    }

    public String getHabitat() {
        return "Bosque";
    }

    public String getNombreCientifico() {
        return "Canis lupus";
    }
    
}
