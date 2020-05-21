package ejercicio5;

public class Pago {

    private int demora;
    private double importe;
    private double interesesAdicionales;

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getInteresesAdicionales() {
        return interesesAdicionales;
    }

    public Pago(int demora, double importe) {
        this.demora = demora;
        this.importe = importe;
        if (demora == 0) {
            this.interesesAdicionales = 0f;
        } else {
            this.interesesAdicionales = importe * demora * 0.005f;
        }
    }

    @Override
    public String toString() {
        return "Importe:" + getImporte() + "demora:" + getDemora() + "intereses cobrados"
                + (getInteresesAdicionales() * getDemora() * getImporte()) + " ";
    }
}
