
package proyectohotel;


public class ReservaVacasiones extends Reserva {
    
    private int cantNinios;
    private double tarifaDiaria;

    public ReservaVacasiones( int habitacion, int cantDias, boolean vigente,int cantNinios) {
        super(habitacion, cantDias, vigente);
        this.cantNinios = cantNinios;
        this.tarifaDiaria=600;
    }
    
    public double tarifaTotal()
    {
        double total=tarifaDiaria*super.getCantDias();
        
        if(cantNinios>0)
        {
            total+=100*this.cantNinios;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Tipo de reserva Vacasion { "+ " Habitacion = " + super.getHabitacion() + ", cantidad de dias reservados "+ super.getCantDias() +
                ", cantidad de niños " + this.cantNinios +", reserva vigente? "+ super.esVigente() +", importe = $" + this.tarifaTotal()+ '}';
    }
    

    
    
    
    
    
}
