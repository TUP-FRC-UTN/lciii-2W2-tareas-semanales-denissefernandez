package supermercado;

import java.util.Scanner;
//import java.util.Date;

public class Supermercado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cantidad de ofertas a cargar:");
        int cantOfertas = sc.nextInt();
//        System.out.println("Ingrese fecha de inicio:");
//        Date fecha=sc.n
        Folleto semanal = new Folleto(cantOfertas);

        for (int i = 0; i < cantOfertas; i++) {

            System.out.println("Oferta:" + (i + 1));
            System.out.println("Codigo de producto");
            int cod = sc.nextInt();
            System.out.println("Producto");
            String prod = sc.nextLine();
            sc.nextLine();
            System.out.println("Precio regular");
            double preReg = sc.nextDouble();
            sc.nextLine();
            System.out.println("Precio en oferta");
            double preOfert = sc.nextDouble();
            sc.nextLine();
            System.out.println("Vigencia");
            int dias = sc.nextInt();
            sc.nextLine();
            System.out.println("Stock");
            int stock = sc.nextInt();
            sc.nextLine();

            Ofertas nueva = new Ofertas(cod, prod, preReg, preOfert, dias, stock);
            semanal.agregarOferta(nueva);
        }

        System.out.println("Cantidad de articulos ofertados por mas de 5 dias:" + " " + semanal.tiempoOfertado());
        System.out.println("Total de unidades que hay a la venta:" + " " + semanal.totalStock());
        System.out.println("Cantidad de artículos ofrecidos con un descuento superior a $20:" + " " + semanal.descuento20());
        System.out.println("Ingrese codigo de un prooducto:");
        int cod = sc.nextInt();
        System.out.println("total a recaudar del articulo" + " " + semanal.artCod(cod) + " " + semanal.recaudacion(cod));

    }

}
