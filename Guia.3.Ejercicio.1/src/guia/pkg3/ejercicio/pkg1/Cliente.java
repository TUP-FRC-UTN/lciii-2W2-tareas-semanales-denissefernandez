
package guia.pkg3.ejercicio.pkg1;

public class Cliente {
    private int numero;
    private String nombre;
    private long tel;

    public Cliente(int numero, String nombre, long tel) {
        this.numero = numero;
        this.nombre = nombre;
        this.tel = tel;
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

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numero=" + numero + ", nombre=" + nombre + ", tel=" + tel + '}';
    }
    
    
    
}
