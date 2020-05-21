
package guia.pkg3.ejercicio.pkg2;


public class CuentaCorriente extends Cuenta {
    
    private double acuerdo;

        
    public double getAcuerdo() {
        return acuerdo;
    }

    public CuentaCorriente(int numero, String nombre, double saldo) {
        super(numero, nombre, saldo);
        this.acuerdo = -500;
    }
    
       
    @Override
      public void Extraer(double monto)
    {
        double saldo2;
        saldo2=this.saldo-monto;
        if(saldo2<acuerdo)
        {
        System.out.println("Su cuenta supera el maximo saldo negativo admisible");
        }
        else 
        {
            this.saldo=saldo-monto;
            System.out.println("Extraccion exitosa");
        }
               
            
    }   
      
       
}
