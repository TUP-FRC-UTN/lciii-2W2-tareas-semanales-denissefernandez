package guia.pkg3.ejercicio.pkg3;

public class Vendedor extends Empleado {

    private float totalVentas;

    public Vendedor(String nombre, int legajo, double sueldoBasico, int tipo, float totalVentas) {
        super(nombre, legajo, sueldoBasico, tipo);

        this.totalVentas = totalVentas;
    }

    @Override
    public double calcularSueldo() {
        double montoFijo = 0;
        double comision = 0;

        comision = totalVentas * 0.01;
        montoFijo = sueldoBasico + comision;

        return montoFijo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de empleado: Vendedor" + ", total de ventas = " + totalVentas
                + ", Sueldo neto a cobrar: " +"$"+this.calcularSueldo() + '\n';
    }

}
