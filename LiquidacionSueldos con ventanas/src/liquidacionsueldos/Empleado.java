
package liquidacionsueldos;

public abstract class Empleado {
    
    private int legajo;
    private String nombre;
    private double sueldoBasico;

    public Empleado(int legajo, String nombre, double sueldoBasico) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldoBasico = sueldoBasico;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }
    public abstract double calcularSueldo();

    @Override
    public String toString() {
        return ", legajo " + legajo + ", nombre " + nombre + ", sueldo basico " + sueldoBasico;
    }
    
    
}
