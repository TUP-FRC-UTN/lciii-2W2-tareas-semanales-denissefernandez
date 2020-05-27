package biblioteca1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cantidad de libros disponibles en la biblioteca:");
        int cant = sc.nextInt();
        sc.nextLine();

        Biblioteca b = new Biblioteca(cant);

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese titulo del libro" + " " + (i + 1));
            String title = sc.next();

            System.out.println("Ingrese precio del libro" + " " + (i + 1));
            int price = sc.nextInt();
            System.out.println("Ingrese estado del libro" + " " + (i + 1) + "(1=disponible / 2=prestado / 3=extraviado)");
            int est = sc.nextInt();
            System.out.println("Ingrese cantidad de prestamos del libro" + " " + (i + 1));
            int presta = sc.nextInt();

            Libro l1 = new Libro(title, price, est, presta);

            for (int j = 0; j < presta; j++) {
                System.out.println("Solicitante del libro");
                String name = sc.next();
                System.out.println("Cantidad de dias prestado");
                int canti = sc.nextInt();
                System.out.println("El libro fue devuelto? (1=si / 2=no)");

                int var = sc.nextInt();
                boolean devuelto = false;
                if (var == 1) {
                    devuelto = true;
                }

                Prestamo p1 = new Prestamo(name, canti, devuelto);
                l1.agregarPrestamo(p1);

            }
            b.agregarLibro(l1);
        }

        System.out.println("INFORMACION \n");
        System.out.println("Cantidad de libros por estado:");
        System.out.println("Disponibles:" + " " + b.librosEstado(1));
        System.out.println("Prestados:" + " " + b.librosEstado(2));
        System.out.println("Extraviados:" + " " + b.librosEstado(3));
        System.out.println("Sumatoria del precio de reposicion de todos los libros extraviados:" + " " + b.SumaXtravios());
        System.out.println("Ingrese titulo de un libro:");
        String libro = sc.next();
        System.out.println("Solicitantes del libro" + " " + libro);
        System.out.println(b.solicitantesLibro(libro));
        System.out.println("Promedio de prestamos de cada libro" + " " + b.promedioPrestamos());

    }

}
