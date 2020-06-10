
package proyectohotel;

public class ReservaNegocios  extends Reserva{
    
    private boolean conferencia;
    private double tarifaDiaria;

    public ReservaNegocios( int habitacion, int cantDias, boolean vigente,boolean conferencia) {
        super(habitacion, cantDias, vigente);
        this.conferencia = conferencia;
        this.tarifaDiaria=500;
    }
    
    public double tarifaTotal()
    {
        double total = tarifaDiaria*super.getCantDias();
        if(conferencia)
        {
            total+=700;
        }
        
        return total;
    }
    
    public String asisteConferencia()
    {
        String asiste="";
        if(this.conferencia)
            asiste="Si";
        else
            asiste="No";
        return asiste;
    }

    @Override
    public String toString() {
        return "Tipo de reserva: Negocios { "+" Habitacion = " + super.getHabitacion() + ", cantidad de dias reservados "+ super.getCantDias() + 
                ", asiste a conferencia? = " + this.asisteConferencia() +", reserva vigente? "+ super.esVigente()+ ", importe = $" + this.tarifaTotal()+ '}';
    }
    
    
    
    
    
}
