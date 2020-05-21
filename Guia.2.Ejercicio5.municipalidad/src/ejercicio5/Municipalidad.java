package ejercicio5;

public class Municipalidad {

    private Plan[] planes;

    public Municipalidad(int tamanio) {
        planes = new Plan[tamanio];
    }

    public void AgregarPlan(Plan p) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] == null) {
                planes[i] = p;
                break;
            }
        }
    }

    public int cantidadPlanesPagados() {
        int contador = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null && planes[i].SinDeuda()) {
                contador++;
            }
        }
        return contador;
    }

    public double PromedioIntereses() {

        int contadorPlanesNoNulos = 0;
        double totalIntereses = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null) {
                totalIntereses += planes[i].CalculoDeIntereses();
                contadorPlanesNoNulos++;
            }
        }
        return totalIntereses / contadorPlanesNoNulos;
    }

    public double sumaDeudas() {
        double acumuladorDeudas = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null) {
                acumuladorDeudas += planes[i].getTotalDeuda();
            }
        }
        return acumuladorDeudas;
    }

//    public ArrayList<Pago> listadoPagoContribuyente(String c) {
//
//        ArrayList <Pago> pagosCont = new ArrayList<Pago>();
//        for (int i = 0; i < 1; i++) {
//            if (planes[i] != null && planes[i].getContribuyente().equals("c")) {
//                pagosCont.add(planes[i].listadoPagos());
//            }
//        }
//        return pagosCont;
//
//    }
    public double promedioIntereses() {
        int contador = 0;
        double acumulador = 0;
        double promedio = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null) {
                acumulador = planes[i].CalculoDeIntereses();
            }
            contador++;
        }
        promedio = acumulador / contador;
        return promedio;
    }
}
