package biblioteca1;

public class Prestamo {

    private String solicitante;
    private int cantDias;
    private boolean devuelto;

    public Prestamo(String solicitante, int cantDias, boolean devuelto) {
        this.solicitante = solicitante;
        this.cantDias = cantDias;
        this.devuelto = devuelto;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "solicitante=" + solicitante + ", cantDias=" + cantDias + ", devuelto=" + devuelto + '}';
    }

}
