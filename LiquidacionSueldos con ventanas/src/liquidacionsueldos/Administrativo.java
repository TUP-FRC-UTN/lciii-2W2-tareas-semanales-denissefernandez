
package liquidacionsueldos;


public class Administrativo extends Empleado{
    
    private boolean presentismo;

    public Administrativo(int legajo, String nombre, double sueldoBasico,boolean presentismo) {
        super(legajo, nombre, sueldoBasico);
        this.presentismo = presentismo;
    }

    public boolean isPresentismo() {
        return presentismo;
    }

    @Override
    public double calcularSueldo(){
        double sueldoNeto=super.getSueldoBasico();
        if(this.isPresentismo()){sueldoNeto+=super.getSueldoBasico()*0.13;}
        return sueldoNeto;
    }
    public String presentismo()
    {
        if(this.isPresentismo()){return "Si";}
        else return "No";
    }

    @Override
    public String toString() {
        return "Tipo de empleado: Administrativo " + super.toString() + ", 100% presentismo? " + this.presentismo()+ ", sueldo neto a cobrar $ "+this.calcularSueldo();
    }
    
    
    
}
