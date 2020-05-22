package supermercado;

//import java.util.Date;
public class Folleto {

    //private Date fecha;
    Ofertas[] oferta;

    public Folleto(int dimension) {
        //this.fecha = fecha;
        this.oferta = new Ofertas[dimension];
    }

//    public Date getFecha() {
//        return fecha;
//    }
//
//    public void setFecha(Date fecha) {
//        this.fecha = fecha;
//    }
    public void agregarOferta(Ofertas nueva) {
        for (int i = 0; i < oferta.length; i++) {
            if (oferta[i] == null) {
                oferta[i] = nueva;
                break;
            }
        }
    }

    public int tiempoOfertado() {
        int contador = 0;

        for (int i = 0; i < oferta.length; i++) {
            if (oferta[i] != null && oferta[i].getVigencia() > 5) {
                contador++;
            }
        }
        return contador;
    }

    public int totalStock() {
        int totales = 0;

        for (int i = 0; i < oferta.length; i++) {
            if (oferta[i] != null) {
                totales += oferta[i].getStock();
            }
        }
        return totales;
    }

    public int descuento20() {
        int cantidad = 0;
        for (int i = 0; i < oferta.length; i++) {
            if (oferta[i] != null && (oferta[i].getPrecioReg() - oferta[i].getPreciOferta()) > 20) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public String artCod(int codigo) {
        String articulo = "";
        for (int i = 0; i < oferta.length; i++) {
            if (oferta[i] != null && oferta[i].getCodigo() == codigo) {
                articulo = oferta[i].getNombre();
            }
        }
        return articulo;
    }

    public double recaudacion(int codigo) {
        double recaudacion = 0;

        for (int i = 0; i < oferta.length; i++) {
            if (oferta[i] != null && oferta[i].getCodigo() == codigo) {
                recaudacion += (oferta[i].getPreciOferta() * oferta[i].getStock());
                break;
            } else {
                System.out.println("Codigo no encontrado");
                break;
            }
        }
        return recaudacion;
    }
}
