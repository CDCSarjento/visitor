/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronvisitor_jk;

/**
 *
 * @author MERCYVISION
 */
public class Tecnologia extends Mercancia {
    

    private int cantidad;
    
    public Tecnologia(String nombre, double precio,int cantidad){
        super(nombre,precio);
        this.cantidad = cantidad;
    }
    
    
    
    

    @Override
    public double descuento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
