/*
Desarrolle la clase Producto de manera que contenga en su interior los
atributos descripción (String) y Materiales (Material[]).
 */
package ejercicio3.fabrica;

public class Producto {
    private String decripcion;
    Material[]materiales;

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }
    
    
    public Producto(String decripcion, int cantMat) {
        this.decripcion = decripcion;
        materiales=new Material[cantMat];
    }
    public void agregarproducto(Material m){
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i]==null){
            materiales[i]= m;
            break;}
        }        
    }
    
    public double returnCosto(){
        double costo;
        costo = 0;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i]!=null)
                costo += materiales[i].getValorUnitario();               
        }
        return costo;
    }
    
    public String Existe(int codigo){
        
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i]!=null && materiales[i].getCodigo()== codigo)
            return "El material si existe en el producto"; 
            
        }
        return "El material no existe en el producto";               
    }
   
         
    
    public Material[] materialesSegunParametro(double parametro){
       Material[] m = new Material[materiales.length];
        int posicion = 0;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i]!= null && materiales[i].getValorUnitario() < parametro){
                m[posicion]= materiales[i];
                posicion++;} //posicion aumenta las posiciones del array
                //porque no puedo poner m[]+=materiales[i]
            }                  
        return m;        
        }
     
    public int[] cantMatPorPrecio(){
        int[] m= new int[4] ;
        int p1=0;
        int p2=0;
        int p3=0;
        int p4=0;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i]!=null)
            {
                 if(materiales[i].getValorUnitario()>0 &&  materiales[i].getValorUnitario()<=10)
                p1++;
            else if(materiales[i].getValorUnitario()>10 && materiales[i].getValorUnitario()<=20)
                p2++;
            else if(materiales[i].getValorUnitario()>20 && materiales[i].getValorUnitario()<=30)
                p3++;
            else if(materiales[i].getValorUnitario()>30)
                p4++;  
            m[0]=p1;
            m[1]=p2;
            m[2]=p3;
            m[3]=p4;
            }           
        }   
        return m;
    }
}
