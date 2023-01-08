/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayindexoutofboundsexception.entidades;



/**
 *
 * @author crist
 */
public class Clase {
    private int[] Vector;

    public Clase(int[] Vector) {
        this.Vector = Vector;
    }

    public int[] getVector() {
        return Vector;
    }

    public void setVector(int[] Vector) {
        this.Vector = Vector;
    }

    @Override
    public String toString() {
        return "Clase{" + "Vector=" + Vector + '}';
    }

    
    
    
}
