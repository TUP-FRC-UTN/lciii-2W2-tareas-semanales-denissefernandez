package biblioteca1;

public class Biblioteca {

    Libro[] libros;

    public Biblioteca(int cantidad) {
        libros = new Libro[cantidad];
    }

    public void agregarLibro(Libro l) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = l;
                break;
            }
        }
    }
//si funciona

    public int librosEstado(int num) {
        int contador = 0;

        for (int i = 0; i < libros.length; i++) {

            if (libros[i] != null && libros[i].getEstado() == num) {
                contador++;

            }
        }
        return contador;
    }

    public double SumaXtravios() {
        double sumador = 0;

        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getEstado() == 3) {
                sumador += libros[i].getPrecio();
            }
        }
        return sumador;
    }

    public String solicitantesLibro(String titulo) {
        String nombres = "";
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                nombres += libros[i].solicitantes();
            }

        }

        return nombres;

    }

    public double promedioPrestamos() {
        double promedio = 0;
        int acumulador = 0;
        int contador = 0;

        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                acumulador += libros[i].cantPrestamos();
                contador++;
            }
        }
        promedio = acumulador / contador;
        return promedio;
    }

}
