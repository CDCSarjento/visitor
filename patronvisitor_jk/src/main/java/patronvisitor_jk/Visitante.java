
package patronvisitor_jk;

public abstract class Visitante {
    
    public abstract void visitarTecnologia(Tecnologia tecno);
    
    public abstract void visitarPerecederos(Perecedero perece);
    
    public abstract void visitarRopa(Ropa ropa);
    
    public abstract void visitarServicios(Servicio servicio);   
    
    
    public void procces(List<Mercancia> mercancias){
        for(Mercancia mercancia : mercancias){
            mercancia.accept(this)
        }
    }
    
}
