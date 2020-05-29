
package guia.pkg3.ejercicio.pkg3;

public class Obrero extends Empleado {
    
   
    private int diasTrabajados;

    public Obrero(String nombre, int legajo, double sueldoBasico,int tipo,int diasTrabajados) {
        super(nombre, legajo, sueldoBasico,tipo);
    
        this.diasTrabajados = diasTrabajados;
    }
        
    @Override
     public double calcularSueldo()
    {
        double montoFijo=0;
        montoFijo=this.sueldoBasico/22;
        
        return montoFijo;
    }

    @Override
    public String toString() {
        return super.toString() +", Tipo de empleado: obrero" + ", dias Trabajados = " + diasTrabajados+
                ", Sueldo neto a cobrar: "+"$"+this.calcularSueldo()+'\n';
    }
    
    
}
