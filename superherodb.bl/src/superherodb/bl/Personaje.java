/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superherodb.bl;

/**
 *
 * @author billy
 */
public abstract class Personaje {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Personaje(String nombre) {
        this.nombre = nombre;
    }
    
    
}
