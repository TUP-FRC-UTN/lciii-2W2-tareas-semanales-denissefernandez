package municipalidad;

public class Plan {

    private String nombre;
    private float deuda;
    private int cuotas;
    Pago[] pagos;

    public Plan(String nombre, float deuda, int cuotas, int cantPgos) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.cuotas = cuotas;
        this.pagos = new Pago[cantPgos];
    }

    public String getNombre() {
        return nombre;
    }

    public int getCuotas() {
        return cuotas;
    }

    public float getDeuda() {
        return deuda;
    }

    public void agregarPago(Pago p) {
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                pagos[i] = p;
                break;
            }

        }
    }

    public int pagosCompletos() {
        int total = 0;

        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] != null) {
                total++;
            }
        }
        return total;
    }

//    public boolean estaPagadoTotalente() {
//        boolean pagado=false;
//        
//        for (int i = 0; i < pagos.length; i++) {
//            if(pagos[i]!=null)
//                pagado=true;            
//        }
//        return pagado;
//        
//    }
    public String listadoPagos() {
        String listado = "";

        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] != null) {
                listado += pagos[i].toString() + "\n";

            }
        }
        return listado;

    }

    public float sumaInteresesCobrados() {
        float suma = 0;

        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] != null) {
                suma += pagos[i].getInteresesAdicionales();
            }
        }
        return suma;
    }

}
