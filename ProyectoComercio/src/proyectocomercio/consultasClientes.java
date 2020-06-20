
package proyectocomercio;

import java.util.ArrayList;

public class consultasClientes {
    
    ArrayList<Clientes> consultas;

    public consultasClientes() {
        consultas=new ArrayList<>();
    }
    
    public void agregarConsulta(Clientes c)
    {
        consultas.add(c);
    }

    public ArrayList<Clientes> getConsultas() {
        return consultas;
    }
    
    
    public int cantConsultasSugerencias()
    {
        int cantidad=0;
        for (Clientes consulta : consultas) {
            if(consulta.getTipoPresentacion()==2 || consulta.getTipoPresentacion()==3)
                cantidad++;            
        }
        return cantidad;
    }
    
    public int reclamosSinSucursal()
    {
        int cant=0;
        for (Clientes consulta : consultas) {
            if(consulta.getSucursalAfectada()==0 && consulta.getTipoPresentacion()==1)
                cant++;            
        }
        return cant;
    }
    
    
}
