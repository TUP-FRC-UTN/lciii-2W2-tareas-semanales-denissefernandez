package composicionequipo;

import java.util.Scanner;

public class ComposicionEquipo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Equipo e;
        System.out.println("Ingrese nombre del equipo:");
        String team = sc.next();
        System.out.println("Ingrese cantidad de jugadores:");
        int players = sc.nextInt();

        e = new Equipo(team, players);

        for (int i = 0; i < players; i++) {
            System.out.println("Nombre jugador:" +" "+ (i + 1));
            String nombre = sc.next();

            System.out.println("posicion del jugador (1=arquero / 2=defensor / 3=mediocampo / 4=delantero)" +" "+(i + 1));
            int pos = sc.nextInt();

            System.out.println("numero de camiseta del jugador" +" "+(i + 1));
            int num = sc.nextInt();

            System.out.println("partidos jugados del jugador" +" "+(i + 1));
            int pj = sc.nextInt();

            System.out.println("Estado fisico del jugador:" +" "+(i + 1));
            double ef = sc.nextDouble();

            Jugador j1 = new Jugador(nombre, pos, num, pj, ef);
              e.agregarJugador(j1);
             }
       
           
        System.out.println("INFORMACION");

        System.out.println("Cantidad de jugadores con menos de diez partidos jugados:" + e.Menos10Partidos());
        System.out.println("Jugador con mayor cantidad de partidos jugados:" + e.JugadorConMasPartidos());
        System.out.println("Promedio de estados fisicos de jugadores:" + e.PromedioEstadoFisico());
        System.out.println("Ingrese un numero de camiseta:");
        int c = sc.nextInt();
        System.out.println("Estado fisico del jugador con  numero de camiseta:"+" "+ c );
        System.out.println(e.EstadoFisicoSegunCamiseta(c));
        System.out.println(e.promedioPorPosicion());

    }

}
