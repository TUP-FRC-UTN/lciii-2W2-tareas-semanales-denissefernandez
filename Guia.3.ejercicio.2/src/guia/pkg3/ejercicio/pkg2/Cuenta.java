
package guia.pkg3.ejercicio.pkg2;


public class Cuenta {
    protected int numero;
    protected String nombre;
    protected double saldo;

    public Cuenta(int numero, String nombre, double saldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Depositar(double deposito)
    {        
        this.saldo=saldo+deposito;
        
    }
       
    
    public void Extraer(double monto)
    {
        this.saldo=saldo-monto;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", nombre=" + nombre + ", saldo=" + saldo + '}';
    }
    
    
    
}
