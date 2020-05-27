package ruleta;

import java.util.Scanner;

public class Ruleta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese jugador:");
        String name = sc.nextLine();
        System.out.println("Ingrese cantidad de apuestas:");
        int cant = sc.nextInt();

        Jugador j = new Jugador(name, cant);

        for (int i = 0; i < cant; i++) {
            System.out.println("Apuesta" + " " + (i + 1));
            System.out.println("Numero apostado:");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.println("Dinero apostado:");
            double money = sc.nextDouble();
            sc.nextLine();
            System.out.println("Numero ganador:");
            int num = sc.nextInt();

            Apuestas bet = new Apuestas(n, money, num);
            j.agregarApuesta(bet);
        }

        System.out.println("Cantidad de apuestas ganadas:" + " " + j.apuestasGanadas());
        System.out.println("Monto acumulado:" + " " + j.montoAcumulado());
        System.out.println("Ingrese un numero:");
        int num1 = sc.nextInt();
        System.out.println("El numero:" + " " + num1 + " " + "salio ganador" + " " + j.cuentaNumero(num1) + " " + "veces");
        System.out.println("Suma del dinero apostado a numeros pares:" + " " + j.sumaPares());
    }

}
