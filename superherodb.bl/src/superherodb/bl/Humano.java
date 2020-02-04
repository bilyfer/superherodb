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
public class Humano extends Personaje implements Super {

    @Override
    public void AgregarPoder(String poder) {
        System.out.println("Agregando poder " + poder + " al humano " + getNombre());
    }

    public Humano(String nombre) {
        this.setNombre(nombre);
    }
    
}
