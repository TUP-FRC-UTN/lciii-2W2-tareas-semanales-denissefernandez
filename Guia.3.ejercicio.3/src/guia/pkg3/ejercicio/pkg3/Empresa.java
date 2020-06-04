package guia.pkg3.ejercicio.pkg3;

import java.util.ArrayList;

public class Empresa {

    private Empleado[] empleados;

    public Empresa(int dimension) {
        this.empleados = new Empleado[dimension];
    }

    public void agregarEmpleado(Empleado a) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] == null) {
                empleados[i] = a;
                break;
            }

        }
    }

    public ArrayList<Empleado> datosEmpleados() {
        ArrayList<Empleado> emplea2 = new ArrayList<>();

        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null) {
                emplea2.add(empleados[i]);
            }

        }
        return emplea2;
    }
// SUMASUELDOS SIN INSTANCE OF
    
//    public double[] sumaSueldos() {
//
//        double[] sumaSueldos = new double[3];
//
//        for (int i = 0; i < empleados.length; i++) {
//            if ((empleados[i] != null)) {
//                switch (empleados[i].getTipoEmpleado()) {
//                    case 1:
//                        sumaSueldos[0] += empleados[i].calcularSueldo();
//                        break;
//                    case 2:
//                        sumaSueldos[1] += empleados[i].calcularSueldo();
//                        break;
//                    default:
//                        sumaSueldos[2] += empleados[i].calcularSueldo();
//                        break;
//                }
//            }
//        }
//        return sumaSueldos;
//
//    }
    
     public double[] sumaSueldos() {

        double[] sumaSueldos = new double[3];

        for (int i = 0; i < empleados.length; i++) {
            if ((empleados[i] != null)) {
                if(empleados[i] instanceof Administrativo) {
                    sumaSueldos[0] += empleados[i].calcularSueldo();
                        }
                else if(empleados[i] instanceof Obrero){
                        sumaSueldos[1] += empleados[i].calcularSueldo();
                        }
                else{sumaSueldos[2] += empleados[i].calcularSueldo();
                        
                }
            }
        }
        return sumaSueldos;

    }

    public double totalGralSueldos() {
        double total = 0;

        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null) {
                total += empleados[i].calcularSueldo();
            }
        }
        return total;
    }

    public ArrayList<Empleado> menorSueldo() {

        ArrayList<Empleado> menorSueldo = new ArrayList<>();

        Empleado emp = empleados[0];

        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null && empleados[i].calcularSueldo() < emp.calcularSueldo()) {
                emp = empleados[i];

            }
        }
        menorSueldo.add(emp);
        return menorSueldo;

    }
//PROMEDIO DE SUELDO DE OBREROS SIN USAR INSTANCE OF
    //
//    public double promSueldosObreros() {
//        
//        double promedio=0;
//        double sumaSueldos=0;
//        int cant=0;
//        
//        for (int i = 0; i < empleados.length; i++) {
//            if(empleados[i]!=null && empleados[i].getTipoEmpleado() == 2){
//                sumaSueldos+=empleados[i].calcularSueldo();
//                cant++;
//            }            
//        }
//        promedio=sumaSueldos/cant;
//        return promedio;
//        
//    }
    
    //PROMEDIO SUELDO OBREROS CON ISNTANCEOF
    
    public double promedSueldosObreros() {
        
        double promedio=0;
        double sumaSueldos=0;
        int cant=0;
        
        for (int i = 0; i < empleados.length; i++) {
            if(empleados[i]!=null && empleados[i] instanceof Obrero){
                sumaSueldos+=empleados[i].calcularSueldo();
                cant++;
            }            
        }
        promedio=sumaSueldos/cant;
        return promedio;
        
    }
    
    

}
