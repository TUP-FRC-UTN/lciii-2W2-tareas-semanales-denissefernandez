
package proyectocomercio;


public class Clientes {
    
    private int numCliente;
    private int tipoPresentacion;
    private int sucursalAfectada;
    private String consulta;

    public Clientes(int numCliente, int tipoPresentacion, int sucursalAfectada, String consulta) {
        this.numCliente = numCliente;
        this.tipoPresentacion = tipoPresentacion;
        this.sucursalAfectada = sucursalAfectada;
        this.consulta = consulta;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public int getTipoPresentacion() {
        return tipoPresentacion;
    }

    public void setTipoPresentacion(int tipoPresentacion) {
        this.tipoPresentacion = tipoPresentacion;
    }

    public int getSucursalAfectada() {
        return sucursalAfectada;
    }

    public void setSucursalAfectada(int sucursalAfectada) {
        this.sucursalAfectada = sucursalAfectada;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    
    public String tipoPresentacion()
    {
        String presentacion="";
        
        if(this.tipoPresentacion==1){presentacion="Reclamo";}
        else if(this.tipoPresentacion==2){presentacion="Consulta";}
        else
            presentacion="Sugerencia";
        return presentacion;
    }

    @Override
    public String toString() {
        return "Clientes{" + "Numero: " + numCliente + ", tipo de presentacion: " + this.tipoPresentacion() + ", sucursal afectada: " 
                + sucursalAfectada + ", texto ingresado:" + consulta + '}';
    }
    
    
    
    
}
