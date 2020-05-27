package municipalidad;

public class Pago {

    private int demora;
    private float importe;
    private double interesesAdicionales;

    public Pago(int demora, float importe) {
        this.demora = demora;
        this.importe = importe;
        if (demora == 0) {
            this.interesesAdicionales = 0;
        } else {
            this.interesesAdicionales = this.demora * this.importe * 0.05;
        }
    }

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public double getInteresesAdicionales() {
        return interesesAdicionales;
    }

    @Override
    public String toString() {
        return "Pago{" + "demora=" + demora + ", importe=" + importe + ", interesesAdicionales=" + interesesAdicionales + '}';
    }

}
