/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superherodb;

/**
 *
 * @author billy
 */
public class Alien extends Personaje implements Super {
    String dialecto;

    public String getDialecto() {
        return dialecto;
    }

    public void setDialecto(String dialecto) {
        this.dialecto = dialecto;
    }
    
    Alien(String nombre, String dialecto) {
        super.setNombre(nombre);
        this.dialecto = dialecto;
    }

    @Override
    public void AgregarPoderes(String poder) {
        System.out.println("Agregando poder a un alien " + poder);
    }

    @Override
    public void AgregarDebilidades(String debilidad) {
        System.out.println("Agregando debilidad a un alien " + debilidad);
    }

    @Override
    public String getQueHabla() {
        return dialecto;
    }
    
}
