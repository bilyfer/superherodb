/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superherodb.bl;

import java.util.ArrayList;

/**
 *
 * @author billy
 */
public class SuperServicio {
    private final ArrayList<Super> ListadeSupers;

    public SuperServicio() {
        ListadeSupers = new ArrayList<>();
        CargarDatos();
    }

    private void CargarDatos() {
        ListadeSupers.add(new Humano("Peter"));
        ListadeSupers.add(new Alien("Thanos"));
    }
    
    public ArrayList<Super> ObtenerSupers() {
        return ListadeSupers;
    }
}
