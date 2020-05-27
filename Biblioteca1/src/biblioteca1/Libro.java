package biblioteca1;

public class Libro {

    private String titulo;
    private int precio;
    private int estado;
    private Prestamo[] prestamos;

    public Libro(String titulo, int precio, int estado, int cantPrestamos) {
        this.titulo = titulo;
        this.precio = precio;
        this.estado = estado;
        prestamos = new Prestamo[cantPrestamos];
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void agregarPrestamo(Prestamo p) {
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] == null) {
                prestamos[i] = p;
                break;
            }

        }
    }

    public String solicitantes() {

        String solicitante = "";
        for (int i = 0; i < prestamos.length; i++) {
            solicitante += prestamos[i].getSolicitante() + "\n";
        }

        return solicitante;

    }

    public int cantPrestamos() {
        int contador = 0;
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] != null) {
                contador++;
            }
        }
        return contador;
    }

//    public String solicitantes() {
//        StringBuilder names = new StringBuilder();
//
//        for (int i = 0; i < prestamos.length; i++) {
//            if (prestamos[i] != null) {
//                names.append(prestamos[i].getSolicitante());
//            }
//
//        }
//        return names.toString();
//    }
//    public int cantPrestamos()
//    {
//        int contador=0;
//        
//        for (int i = 0; i < prestamos.length; i++) {
//            if(prestamos[i]!=null)
//                contador++;            
//        }
//        return contador;
//    }
}
