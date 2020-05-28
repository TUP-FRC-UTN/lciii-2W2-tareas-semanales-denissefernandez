/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicionequipo;

/**
 *
 * @author User
 */
public class Equipo {
        
    private String nombrEquipo;
//    private int puntos;
//    private int ganados;
//    private int empates;
//    private int perdidos;
//    private int golesRealizados;
//    private int golesRecibidos;
//    private String posicion;
    private Jugador[]players;
    
    public void setNombrequipo(String nombre){
        this.nombrEquipo=nombre;    
    }
    public String getNombrequipo(){
        return nombrEquipo;
    }
    
//    public void setPuntos(int ptos){
//        this.puntos=ptos;    
//    }
//    public int getPuntos(){
//        return puntos;
//    }
//    
//    public void setGanados(int gana2){
//        this.ganados=gana2;    
//    }
//    public int getGanados(){
//        return ganados;
//    }
//    
//    public void setEmpates(int empata2){
//        this.empates=empata2;    
//    }
//    public int getEmpates(){
//        return empates;
//    }
//    
//    public void setPerdidos(int perdi2){
//        this.perdidos=perdi2;    
//    }
//    public int getPerdidos(){
//        return perdidos;
//    }
//    
//    public void setGolesRealizados(int goles){
//        this.golesRealizados=goles;    
//    }
//    public int getGolesRealizados(){
//        return golesRealizados;
//    }
//    
//    public void setGolesRecibidos(int gol){
//        this.golesRecibidos=gol;    
//    }
//    public int getGolesRecibidos(){
//        return golesRecibidos;
//    }
//    
//    public void setPosicion(String position){
//        this.posicion=position;    
//    }
//    public String getPosition(){
//        return posicion;
//    }
    
    public Equipo(){
    nombrEquipo="";
//    puntos=0;
//    ganados=0;
//    empates=0;
//    perdidos=0;
//    golesRealizados=0;
//    golesRecibidos=0;
//    posicion="";
    }
    
    public Equipo(String nombrEquipo,int cantidad ){//,int puntos,int ganados,int empates,int perdidos,
//           int golesRealizados,int golesRecibidos,String posicion
    
    this.nombrEquipo=nombrEquipo;
//    this.puntos=puntos;
//    this.ganados=ganados;
//    this.empates=empates;
//    this.perdidos=perdidos;
//    this.golesRealizados=golesRealizados;
//    this.golesRecibidos=golesRecibidos;
//    this.posicion=posicion;
    players =new Jugador[cantidad];
    }
    
    public void agregarJugador(Jugador p1){
            for (int i = 0; i <players.length; i++) {
            if(players[i]==null){
                players[i]=p1;
            break;}
            }              
        }
    
    
    public int Menos10Partidos(){
        int sumador=0;
        for (int i = 0; i <players.length; i++) {
            if(players[i]!=null && players[i].getPartidosJugados()<10)
                sumador++;}
        return sumador;
    }
    
    public String JugadorConMasPartidos(){
        Jugador pl1=players[0];      
        
        for (int i = 0; i <players.length; i++) {
            if(players[i]!=null && players[i].getPartidosJugados() > pl1.getPartidosJugados())
                pl1=players[i];                
        }
        return pl1.getNombre();  
    }
    
    public double PromedioEstadoFisico(){
        
    double sumaEstados=0;
    int contadorJugadores=0;
    double promedioEstados=0;
    
        for (int i = 0; i <players.length; i++) {
            if(players[i]!=null){
                sumaEstados+=players[i].getEstadoFisico(); 
                contadorJugadores++;}
        }
        promedioEstados=sumaEstados/contadorJugadores;
        return promedioEstados;       
    
    }
    
    public double EstadoFisicoSegunCamiseta(int c){
        double estado=0;
        for (int i = 0; i < players.length; i++) {
            if(players[i]!=null && players[i].getNumeroCamiseta()==c){
                estado=players[i].getEstadoFisico();
                break;
            }
        }
        return estado;        
    }
    
    public String promedioPorPosicion(){
        int [] acumuladorPosiciones = new int[4];

        int [] contadorPosiciones = new int[4];

        for (int i = 0; i < players.length; i++) {

            if(players[i] != null)

            {

                switch(players[i].getPosicion())

                {

                    case 1:

                        acumuladorPosiciones[0] += players[i].getPartidosJugados();

                        contadorPosiciones[0]++;

                        break;

                    case 2:

                        acumuladorPosiciones[1] += players[i].getPartidosJugados();

                        contadorPosiciones[1]++;

                        break;

                    case 3:

                        acumuladorPosiciones[2] += players[i].getPartidosJugados();

                        contadorPosiciones[2]++;

                        break;

                    case 4:

                        acumuladorPosiciones[3] += players[i].getPartidosJugados();

                        contadorPosiciones[3]++;

                        break;

                }

            }

        }
        return "El promedio de partidos jugados de la posicion 1 es: " 
                + (double)acumuladorPosiciones[0] / contadorPosiciones[0] + "\n "+
               "El promedio de partidos jugados de la posicion 2 es: " +
                (double)acumuladorPosiciones[1] / contadorPosiciones[1]+ "\n "+
               "El promedio de partidos jugados de la posicion 3 es: " 
                + (double)acumuladorPosiciones[2] / contadorPosiciones[2] + "\n "+
               "El promedio de partidos jugados de la posicion 4 es: " 
                + (double)acumuladorPosiciones[3] / contadorPosiciones[3];    
        
    }

    
//    public String toString(){
//        return "Equipo:" + nombrEquipo ;//+ "posicion:" + posicion;
//    }
    
    
    
    
}
