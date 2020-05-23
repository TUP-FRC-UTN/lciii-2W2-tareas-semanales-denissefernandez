package ruleta;

class Apuestas {

    private int numApostado;
    private double dineroApostado;
    private int numeroGanador;

    public Apuestas(int numApostado, double dineroApostado, int numeroGanador) {
        this.numApostado = numApostado;
        this.dineroApostado = dineroApostado;
        this.numeroGanador = numeroGanador;
    }

    public int getNumApostado() {
        return numApostado;
    }

    public void setNumApostado(int numApostado) {
        this.numApostado = numApostado;
    }

    public double getDineroApostado() {
        return dineroApostado;
    }

    public void setDineroApostado(double dineroApostado) {
        this.dineroApostado = dineroApostado;
    }

    public int getNumeroGanador() {
        return numeroGanador;
    }

    public void setNumeroGanador(int numeroGanador) {
        this.numeroGanador = numeroGanador;
    }

    @Override
    public String toString() {
        return "Apuestas{" + "numApostado=" + numApostado + ", dineroApostado=" + dineroApostado + ", numeroGanador=" + numeroGanador + '}';
    }

}
