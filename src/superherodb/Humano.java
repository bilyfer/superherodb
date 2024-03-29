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
public class Humano extends Personaje implements Super { 
    String idioma;

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    Humano(String nombre, String idioma) {
        super.setNombre(nombre);
        this.idioma = idioma;
    }

    @Override
    public void AgregarPoderes(String poder) {
        System.out.println("Agregando poder a un humano " + poder);      
    }

    @Override
    public void AgregarDebilidades(String debilidad) {
        System.out.println("Agregando debilidad a un humano " + debilidad);
    }

    @Override
    public String getQueHabla() {
        return idioma;
    }

}
