
package proyectohotel;

import java.util.ArrayList;

public class ArreglosReservas {
    
    ArrayList<Reserva> reservas;

    public ArreglosReservas() {
        
        reservas = new ArrayList<Reserva>();
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
    
    public void agregarReserva(Reserva r)
    {
       reservas.add(r);            
        
    }
    
    public double facturacionTotal()
    {
        double total=0;
        
        for (Reserva reserva : reservas) {
            if(reserva.isVigente()){
            total+=reserva.tarifaTotal();}         
        }
        
        return total;
    }
    
    public int[] cantReservasXtipo()
    {
        int[] r= new int[2];
        
        for (Reserva reserva : reservas) {
            if(reserva instanceof ReservaVacasiones)
            {
                r[0]++;
            }
            else
            {
                r[1]++;
            }
        }
        return r;
    }
    
}
