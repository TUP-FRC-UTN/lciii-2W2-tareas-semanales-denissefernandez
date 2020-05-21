package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cantidad de planes a cargar");
        int tamanio = sc.nextInt();
        sc.nextLine();
        Municipalidad m = new Municipalidad(tamanio);

        for (int i = 0; i < tamanio; i++) {

            System.out.println("Ingrese contribuyente:");
            String cliente1 = sc.nextLine();
            System.out.println("Ingrese monto total del plan:");
            float monto = sc.nextFloat();
            sc.nextLine();
            System.out.println("Ingrese cantidad de cuotas del plan:");
            int cuotas = sc.nextInt();
            sc.nextLine();

            Plan p1 = new Plan(cliente1, monto, cuotas);

            System.out.println("Ingrese cantidad de cuotas a abonar:");
            int cant = sc.nextInt();
            sc.nextLine();
            if (cant > 0) {

                for (int j = 0; j < cant; j++) {

                    System.out.println("Ingrese dias de demora");
                    int demora = sc.nextInt();
                    sc.nextLine();
                    double importe = (monto / cuotas) + (monto * demora * 0.05);
                    System.out.println("Importe a abonar:" + importe);

                    Pago pay1 = new Pago(demora, importe);
                    p1.agregarPago(pay1);
                }

            }
            m.AgregarPlan(p1);
        }

        System.out.println("Cantidad de planes pagados en su totalidad:" + m.cantidadPlanesPagados());
        System.out.println("Sumatoria de deudas registradas:" + m.sumaDeudas());
//        System.out.println("Ingrese contribuyente:");
//        String nombre=sc.nextLine();
//        System.out.println("Listado de pagos del contribuyente" + nombre + "\n");
        System.out.println("Promedio de intereses acumulados:" + m.PromedioIntereses());

    }

}
