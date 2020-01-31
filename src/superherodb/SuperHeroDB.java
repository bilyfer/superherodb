/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superherodb;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author billy
 */
public class SuperHeroDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Super steve = new Humano("Steve Rogers", "Español");
        Super thanos = new Alien("Thanos", "Titan");
        
        List<Super> listadeSupers = new ArrayList<>();
        
        listadeSupers.add(steve);
        listadeSupers.add(thanos);
        
        for(Super s: listadeSupers) {
            System.out.println(s.getNombre() + " " + s.getQueHabla());
        }
    }
    
}
