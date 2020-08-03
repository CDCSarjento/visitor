
package patronvisitor_jk;


public abstract class Mercancia {
    private String nombre;
    private double precio;
    
    
    public Mercancia(String nombre,double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public String get_nombre(){
        return nombre;
    }
    public abstract double descuento();
    

    
    
   
    
}
