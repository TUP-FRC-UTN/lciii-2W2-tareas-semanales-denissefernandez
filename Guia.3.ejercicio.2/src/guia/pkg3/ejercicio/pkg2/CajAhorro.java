
package guia.pkg3.ejercicio.pkg2;

public class CajAhorro extends Cuenta{

    public CajAhorro(int numero, String nombre, double saldo) {
        super(numero, nombre, saldo);
    }
    
    @Override
      public void Extraer(double monto)
    {
        
        if(monto>saldo){
            System.out.println("Su saldo no puede quedar en negativo");           
        }
        else
        {     
            this.saldo=saldo-monto;
            System.out.println("Extraccion exitosa");
        }
        
    }
    
}
