
package composicionequipo;


public class Jugador {
    private String nombre;
    private int posicion; 
    private int numeroCamiseta;
    private int partidosJugados;
    private double estadoFisico;
    
    public void setNombre( String nombre){
    this.nombre=nombre;}
    public String getNombre(){
    return nombre;}
    
    public void setPosicion( int posicion){
    this.posicion=posicion;}
    public int getPosicion(){
    return posicion;}
    
    public void setNumeroCamiseta( int numeroCamiseta){
    this.numeroCamiseta=numeroCamiseta;}
    public int getNumeroCamiseta(){
    return numeroCamiseta;}
    
    public void setPartidosJugados( int partidosJugados){
    this.partidosJugados=partidosJugados;}
    public int getPartidosJugados(){
    return partidosJugados;}
    
    public void setEstadoFisico( double estadoFisico){
    this.estadoFisico=estadoFisico;}
    public double getEstadoFisico(){
    return estadoFisico;}
    
       
    public Jugador(String name, int posicion,int numeroCamiseta,int partidosJugados,double estadoFisico){
    this.nombre=name;
    this.posicion=posicion;
    this.numeroCamiseta=numeroCamiseta;
    this.partidosJugados=partidosJugados;
    this.estadoFisico=estadoFisico;
    }  
    
    public String Posicion(){
        if (this.posicion==1){return "arquero";}
        else if(this.posicion==2){return "defensor";}
        else if(this.posicion==3){return "mediocampo";}
        else return "delantero";
    }
    
    public String toString(){
        return "Jugador:" + nombre + "" +"posicion" + Posicion()             
                    + "estado fisico:" + estadoFisico;}
            
    
}
