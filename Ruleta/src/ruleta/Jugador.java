package ruleta;

public class Jugador {

    private String nombre;
    private Apuestas[] apuesta;

    public Jugador(String nombre, int cantApuestas) {
        this.nombre = nombre;
        apuesta = new Apuestas[cantApuestas];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarApuesta(Apuestas a) {
        for (int i = 0; i < apuesta.length; i++) {
            if (apuesta[i] == null) {
                apuesta[i] = a;
                break;
            }

        }
    }

    public int apuestasGanadas() {
        int sumador = 0;

        for (int i = 0; i < apuesta.length; i++) {
            if (apuesta[i] != null && apuesta[i].getNumApostado() == apuesta[i].getNumeroGanador()) {
                sumador++;
            }
        }
        return sumador;
    }

    public double montoAcumulado() {
        double monto = 0;

        for (int i = 0; i < apuesta.length; i++) {
            if (apuesta[i] != null) {
                if (apuesta[i].getNumApostado() == apuesta[i].getNumeroGanador()) {
                    monto += apuesta[i].getDineroApostado() * 36;
                } else {
                    monto -= apuesta[i].getDineroApostado();

                }
            }
        }
        return monto;
    }

    public int cuentaNumero(int numero) {
        int contador = 0;

        for (int i = 0; i < apuesta.length; i++) {
            if (apuesta[i] != null && apuesta[i].getNumeroGanador() == numero) {
                contador++;
            }
        }
        return contador;
    }

    public double sumaPares() {
        double suma = 0;

        for (int i = 0; i < apuesta.length; i++) {
            if (apuesta[i] != null && apuesta[i].getNumApostado() % 2 == 0) {
                suma += apuesta[i].getDineroApostado();
            }
        }
        return suma;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apuesta=" + apuesta + '}';
    }

}
