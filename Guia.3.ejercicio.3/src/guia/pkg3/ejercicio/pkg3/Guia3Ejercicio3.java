/*En una empresa hay tres tipos de empleados, cada uno de ellos con diferentes
fórmulas para el cálculo de sus sueldos.
 Obrero: cobra un monto fijo por cada día trabajado igual al sueldo básico
dividido en 22.
 Administrativo: cobra un monto fijo por mes más un 13 % si cumplió con el
presentismo.
 Vendedor: cobra un monto fijo por mes más una comisión de 1 % del total de
sus ventas.
Se requiere representar esta situación con una o más clases aplicando
polimorfismo.

3. En base al ejercicio de empleados resuelto en el material teórico, hacer un
programa que permita cargar los datos de todos los empleados de una empresa y
efectúe la liquidación de los sueldos, mostrando un listado de todos los empleados y
el sueldo neto que les corresponde cobrar.
A continuación mostrar los siguientes reportes:
a. El total a pagar en sueldo para cada tipo de empleados
b. El total general.
c. Todos los datos del empleado que menos cobra.
d. Promedio de sueldos de los obreros.

 */
package guia.pkg3.ejercicio.pkg3;

import java.util.Scanner;

public class Guia3Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de empleados:");
        int cant=sc.nextInt();
        
        Empresa e=new Empresa(cant);
        
        for (int i = 0; i < cant; i++) {
            
            System.out.println("Ingrese nombre del empleado"+" "+(i+1));
            String name=sc.next();
            System.out.println("Ingrese legajo del empleado"+" "+(i+1));
            int legajo=sc.nextInt();
            System.out.println("Ingrese sueldo basico del empleado"+" "+(i+1));
            double sueldo=sc.nextDouble();
            System.out.println("Ingrese tipo de empleado (1=Administrativo - 2=Obrero - 3=Vendedor):");
            int tipo=sc.nextInt();            
            if(tipo==1){
                
                System.out.println("Presentismo completo? (1=Si - 2=No)");
                int num=sc.nextInt();                
                boolean pre=false;
                if(num==1){
                    pre=true; }
                
                Administrativo a=new Administrativo(name,legajo,sueldo,tipo,pre);
                 e.agregarEmpleado(a);
            }
            else if(tipo==2){
                
                System.out.println("Ingrese cantidad de dias trabajados");
                int cantDias=sc.nextInt();
                
                Obrero o=new Obrero(name,legajo,sueldo,tipo,cantDias);
                 e.agregarEmpleado(o);
            }
            else{
                
                System.out.println("Ingrese el total de las ventas");
                float totalVtas=sc.nextFloat();
                
                Vendedor v=new Vendedor(name,legajo,sueldo,tipo,totalVtas);
                  e.agregarEmpleado(v);
            }        
           
          
            
        }
        System.out.println("INFORMACION");
        System.out.println("TOTALES A PAGAR A CADA EMPLEADO:");
        System.out.println(e.datosEmpleados());
        System.out.println("SUMA DE SUELDOS POR TIPO DE EMPLEADOS");
        double[] aux=e.sumaSueldos();
        System.out.println("ADMINISTRATIVOS: ");
        for (int i = 0; i < aux.length; i++) {
             System.out.println("$"+aux[0]);
             break;
        }
        System.out.println("OBREROS: ");
        for (int i = 0; i < aux.length; i++) {
             System.out.println("$"+aux[1]);
             break;
        }
        System.out.println("VENDEDORES: ");
        for (int i = 0; i < aux.length; i++) {
             System.out.println("$"+aux[2]);
             break;
        }
        System.out.println("TOTAL DE SUELDOS");
        System.out.println("$"+e.totalGralSueldos());
        System.out.println("EL EMPLEADO CON EL MENOR SUELDO:");
        System.out.println(e.menorSueldo());
        System.out.println("PROMEDIO DE SUELDOS DE LOS OBREROS:");
        System.out.println("$"+ e.promedSueldosObreros());
       
        
        
        
        
    }
    
}
