package municipalidad;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cantidad de planes a cargar:");
        int c = sc.nextInt();

        Municipalidad muni = new Municipalidad(c);

        for (int i = 0; i < c; i++) {
            System.out.println("Ingrese nombre del contribuyente:");
            String plan = sc.next();
            System.out.println("Ingrese monto de la deuda:");
            float deuda = sc.nextFloat();
            System.out.println("Ingrese cantidad de cuotas del plan" + " " + (i + 1));
            int cant = sc.nextInt();
            System.out.println("Cantidad de pagos realizados para el plan" + " " + (i + 1));
            int pagos = sc.nextInt();

            Plan p = new Plan(plan, deuda, cant, pagos);

            for (int j = 0; j < pagos; j++) {
                System.out.println("Ingrese demora");
                int demora = sc.nextInt();
                System.out.println("Ingrese importe abonado");
                float money = sc.nextFloat();

                Pago pay = new Pago(demora, money);
                p.agregarPago(pay);

            }
            muni.agregarPlan(p);

        }

        System.out.println("INFORMACION");
        System.out.println("Cantidad de planes pagados en su totalidad");
        System.out.println(muni.cantidadPlanesPagados());
        System.out.println("Sumatoria de las deudas registradas");
        System.out.println(muni.sumatoriaDeudas());
        System.out.println("Ingrese nombre del contribuyente:");
        String nombre = sc.next();
        System.out.println("Listado de los pagos del contribuyente" + " " + nombre);
        System.out.println(muni.listadoPagosContribuyente(nombre));
        System.out.println("Promedio general de intereses cobrados");
        System.out.println(muni.promedioIntereses());

    }

}
