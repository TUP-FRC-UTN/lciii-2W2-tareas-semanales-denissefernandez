
package guia.pkg3.ejercicio.pkg3;


public class Empleado {
    
    protected String nombre;
    protected int legajo;
    protected double sueldoBasico;
    private int tipoEmpleado;

    public Empleado(String nombre, int legajo, double sueldoBasico,int tipo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldoBasico = sueldoBasico;
        this.tipoEmpleado=tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public int getTipoEmpleado() {
        return tipoEmpleado;
    }
    
     public double calcularSueldo()
    {
        double montoFijo=0;
        montoFijo=this.sueldoBasico;
        
        return montoFijo;
    }
    

    @Override
    public String toString() {
        return "Empleado:" + " nombre = " + nombre + ", legajo = " + legajo + ", sueldo Basico = " +"$"+ sueldoBasico;
    }
    
       
    
    
}
