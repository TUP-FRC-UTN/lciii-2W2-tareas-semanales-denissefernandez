package guia.pkg3.ejercicio.pkg3;

public class Administrativo extends Empleado {

    private boolean presentismo;

    public Administrativo(String nombre, int legajo, double sueldoBasico, int tipo, boolean presentismo) {
        super(nombre, legajo, sueldoBasico, tipo);

        this.presentismo = presentismo;
    }

    @Override
    public double calcularSueldo() {
        double montoFijo = this.sueldoBasico;
        if (presentismo) {
            montoFijo = (sueldoBasico * 0.13) + sueldoBasico;
        }

        return montoFijo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de empleado: Administrativo" + ", presentismo = " + presentismo
                + ", Sueldo neto a cobrar " + "$"+this.calcularSueldo() + '\n';
    }

}
