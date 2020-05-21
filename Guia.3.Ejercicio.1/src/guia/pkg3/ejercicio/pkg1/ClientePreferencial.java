
package guia.pkg3.ejercicio.pkg1;

public class ClientePreferencial extends Cliente {
    private double saldo;
    private int limiteSaldo;
    private String domicilio;

    public ClientePreferencial(double saldo, int limiteSaldo, String domicilio, int num,String name, long tel) 
            {
        super(num,name,tel);
        this.saldo = saldo;
        this.limiteSaldo = limiteSaldo;
        this.domicilio = domicilio;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getLimiteSaldo() {
        return limiteSaldo;
    }

    public void setLimiteSaldo(int limiteSaldo) {
        this.limiteSaldo = limiteSaldo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "ClientePreferencial{" + "saldo=" + saldo + ", limiteSaldo=" + limiteSaldo + ", domicilio=" + domicilio + '}';
    }
    
    
    
}
