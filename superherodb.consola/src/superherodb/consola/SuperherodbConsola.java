/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superherodb.consola;

import superherodb.bl.Alien;
import superherodb.bl.Humano;
import superherodb.bl.Personaje;
import superherodb.bl.Super;

/**
 *
 * @author billy
 */
public class SuperherodbConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Super peter = new Humano("Peter Parker");
        
        peter.AgregarPoder("Punzada");              
        
        Super loky = new Alien("Loky");
        loky.AgregarPoder("Magia");
    }    
}
