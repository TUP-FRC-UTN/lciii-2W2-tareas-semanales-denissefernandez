package ejercicio5;

public class Plan {

    private String contribuyente;
    private float totalDeuda;
    private int cantidadCuotas;
    private Pago[] cuotasPagadas;

    public void setContribuyente(String nombre) {
        contribuyente = nombre;
    }

    public String getContribuyente() {
        return contribuyente;
    }

    public void setTotalDeuda(float deuda) {
        totalDeuda = deuda;
    }

    public float getTotalDeuda() {
        return totalDeuda;
    }

    public void setCantidadCuotas(int cuotas) {
        cantidadCuotas = cuotas;
    }

    public float getCantidadCuotas() {
        return cantidadCuotas;
    }

    public Plan() {
        contribuyente = "";
        totalDeuda = 0;
        cantidadCuotas = 0;
    }

    public Plan(String nombre, float deuda, int cuotas) {
        /*pido como atributo el tamaño del arreglo*/
        contribuyente = nombre;
        totalDeuda = deuda;
        cantidadCuotas = cuotas;
        cuotasPagadas = new Pago[cuotas];
    }

    /*metodo para agregar pagos al arreglo, pido un atributo de clase Pago para llenar mi
    arreglo de pagos*/
    public void agregarPago(Pago p) {
        for (int i = 0; i < cuotasPagadas.length; i++) {
            if (cuotasPagadas[i] == null) {
                cuotasPagadas[i] = p;
                break;
            }
        }
    }

    public boolean SinDeuda() {
        for (int i = 0; i < cuotasPagadas.length; i++) {
            if (cuotasPagadas[i] == null);
            return false;
        }
        return true;
    }

    public double CalculoDeIntereses() {
        double sumaInteres = 0;
        for (int i = 0; i < cuotasPagadas.length; i++) {
            if (cuotasPagadas[i] != null) {
                if (cuotasPagadas[i].getDemora() > 0) {
                    sumaInteres += cuotasPagadas[i].getInteresesAdicionales();
                }
            }

        }
        return sumaInteres;
    }
}

//    public Pago[] listadoPagos(){
//        int posicion=0;
//        Pago importes [] =new Pago[cuotasPagadas.length];
//        for (int i = 0; i < cuotasPagadas.length; i++) {
//            if(cuotasPagadas[i]!=null){
//            importes[posicion] = cuotasPagadas[i];
//            posicion++;}
//                    }
//        return importes;
//    }
//    
//    

