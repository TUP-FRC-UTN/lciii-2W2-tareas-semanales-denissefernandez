package supermercado;

public class Ofertas {

    private int codigo;
    private String nombre;
    private double precioReg;
    private double preciOferta;
    private int vigencia;
    private int stock;

    public Ofertas(int codigo, String nombre, double precioReg, double preciOferta, int vigencia, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioReg = precioReg;
        this.preciOferta = preciOferta;
        this.vigencia = vigencia;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioReg() {
        return precioReg;
    }

    public void setPrecioReg(double precioReg) {
        this.precioReg = precioReg;
    }

    public double getPreciOferta() {
        return preciOferta;
    }

    public void setPreciOferta(double preciOferta) {
        this.preciOferta = preciOferta;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Ofertas{" + "codigo=" + codigo + ", nombre=" + nombre + ", precioReg=" + precioReg + ", preciOferta=" + preciOferta + ", vigencia=" + vigencia + ", stock=" + stock + '}';
    }

}
