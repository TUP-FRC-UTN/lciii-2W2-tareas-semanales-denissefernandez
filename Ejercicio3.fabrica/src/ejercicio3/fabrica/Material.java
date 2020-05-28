/*
 Desarrolle la clase Material de manera que contenga en su interior los
atributos: descripción (String) código(int) valorUnitario (float).
 */
package ejercicio3.fabrica;


public class Material {
    private String descripcion;
    private int codigo;
    private double valorUnitario;

    public Material( String descripcion, int codigo, double valorUnitario) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    @Override
    public String toString(){
    return "MATERIAL:" + "{" + descripcion + ", " + "codigo" + " " + codigo + ", " + "valor unitario" + " " +"$"+valorUnitario+"}";}
    
}
