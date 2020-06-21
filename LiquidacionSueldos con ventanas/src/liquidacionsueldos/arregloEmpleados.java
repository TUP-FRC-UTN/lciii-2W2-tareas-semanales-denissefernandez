
package liquidacionsueldos;

import java.util.ArrayList;


public class arregloEmpleados {
    
    private ArrayList<Empleado> arregloEmpleados;

    public arregloEmpleados() {
        this.arregloEmpleados = new ArrayList<>();
    }
    public void agregarEmpleadoNuevo(Empleado e)
    {
        arregloEmpleados.add(e);
    }

    public ArrayList<Empleado> getArregloEmpleados() {
        return arregloEmpleados;
    }
    
    public double[] totalesXtipo()
    {
        double[] totales=new double[3];
        for (Empleado a : arregloEmpleados) {
            if(a instanceof Administrativo){totales[0]+=a.calcularSueldo();}
            else if(a instanceof Obrero){totales[1]+=a.calcularSueldo();}
            else if(a instanceof Vendedor){totales[2]+=a.calcularSueldo();}            
        }
        return totales;
    }
    
    public double totalGral()
    {
        double total=0;
        for (Empleado a : arregloEmpleados) {
            total+=a.calcularSueldo();            
        }
        return total;
    }
    
    public String menorSueldo()
    {
        Empleado e=arregloEmpleados.get(0);
        for (Empleado emp : arregloEmpleados) {
            if(emp.calcularSueldo()<e.calcularSueldo())
            {
                e=emp;
            }
        }
        
        return e.toString();
    }
    
   public double promSueldoObreros()
   {
       int cant=0;
       double acumuladorSueldos=0;
       for (Empleado a : arregloEmpleados) {
           if(a instanceof Obrero)
           {
               acumuladorSueldos+=a.calcularSueldo();
               cant++;
           }           
       }
       return acumuladorSueldos/cant;
   }
    
    
    
}
