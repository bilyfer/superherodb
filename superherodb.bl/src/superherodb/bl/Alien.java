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
public class Alien extends Personaje implements Super {

    public Alien(String nombre) {
        super(nombre);
    }
    
    @Override
    public void AgregarPoder(String poder) {
        System.out.println("Agregando poder " + poder + " al alien " + getNombre());
    }
    
}
