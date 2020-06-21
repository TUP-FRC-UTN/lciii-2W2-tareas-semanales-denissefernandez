
package liquidacionsueldos;

public class Obrero extends Empleado{
    
    private int diasTrabajados;

    public Obrero(int legajo, String nombre, double sueldoBasico,int diasTrabajados) {
        super(legajo, nombre, sueldoBasico);
        this.diasTrabajados = diasTrabajados;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    @Override 
    public double calcularSueldo()
    {
        double sueldoNeto;
        sueldoNeto=(super.getSueldoBasico()/22)*this.diasTrabajados;
        return sueldoNeto;
    }
    
    @Override
    public String toString() {
        return "Tipo de empleado:Obrero " + super.toString() + ", diasTrabajados " + diasTrabajados + ", sueldo neto a cobrar $ " + this.calcularSueldo();
    }
    
    
    
}
