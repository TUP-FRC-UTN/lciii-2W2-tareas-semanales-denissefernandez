
package liquidacionsueldos;

public class Vendedor extends Empleado{
    
    private float totalVentas;

    public Vendedor(int legajo, String nombre, double sueldoBasico,float totalVentas) {
        super(legajo, nombre, sueldoBasico);
        this.totalVentas = totalVentas;
    }
    
    @Override
    public double calcularSueldo()
    {
        double comision=this.totalVentas*0.01;
        double sueldoNeto=super.getSueldoBasico()+comision;
        return sueldoNeto;        
    }

    @Override
    public String toString() {
        return "Tipo de empleado:Vendedor " + super.toString() + " total de ventas " + totalVentas + ", sueldo neto a cobrar $ " + this.calcularSueldo();
    }
    
    
    

    
        
    }

    
    
    
    

