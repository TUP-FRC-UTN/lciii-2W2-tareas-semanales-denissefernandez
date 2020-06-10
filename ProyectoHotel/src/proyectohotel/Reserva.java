
package proyectohotel;


public abstract class Reserva {
    private int habitacion;
    private int cantDias;
    private boolean vigente;

    public Reserva(int habitacion, int cantDias, boolean vigente) {
        this.habitacion = habitacion;
        this.cantDias = cantDias;
        this.vigente = vigente;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public int getCantDias() {
        return cantDias;
    }

    public boolean isVigente() {
        return vigente;
    }
    
      public String esVigente()
    {
        String vigente="";
        if(this.isVigente())
            vigente="Si";
        else
            vigente="No";
        return vigente;
    }
    
    public abstract double tarifaTotal();

    
    @Override
    public abstract String toString();
    
   
    
    
}
