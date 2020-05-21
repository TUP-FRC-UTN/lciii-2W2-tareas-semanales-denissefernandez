/*
2. En un banco hay dos tipos de cuentas: cajas de ahorro y cuentas corrientes.
Programar una clase Cuenta y dos derivadas correspondientes a cada uno de los
tipos de cuenta.
La clase Cuenta debe poseer dos métodos para operar con las mismas llamados
Depositar y Extraer.
Las cajas de ahorro no permiten extracciones si el saldo no es suficiente, mientras
que las cuentas corrientes poseen un atributo “acuerdo” que indica el máximo saldo
negativo admisible. La clase cuenta debe poseer al menos los atributos número,
nombre y saldo.
 */
package guia.pkg3.ejercicio.pkg2;

import java.util.Scanner;
public class Guia3Ejercicio2 {

    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);      
        
               
        System.out.println("Ingrese numero de cuenta");
        int cuenta=sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese nombre");
        String nombre=sc.nextLine();
       
        System.out.println("Ingrese saldo");
        double saldo=sc.nextDouble();
        sc.nextLine();
        
                
        System.out.println("Ingrese tipo de cuenta: 1 = cuenta corriente 2 = caja de ahorro");
        int tipo=sc.nextInt(); 
        if(tipo<1 || tipo>2)
        {
            System.out.println("Numero invalido");
        }
        else
        {
            if(tipo==1){
            CuentaCorriente cc=new CuentaCorriente(cuenta,nombre,saldo);
            System.out.println("Ingrese 1 para depositos - 2 para extracciones");
        int num=sc.nextInt();
        if(num==1){
                System.out.println("Ingrese monto a depositar:");                 
                cc.Depositar(sc.nextDouble());
                System.out.println("Informacion de su cuenta:" + cc.toString());
        }
        else{
            System.out.println("Ingrese monto a extraer:");                 
                cc.Extraer(sc.nextDouble());
                System.out.println("Informacion de su cuenta:" + cc.toString());}
        }
        
        else if(tipo==2){        
            CajAhorro ca=new CajAhorro(cuenta,nombre,saldo);
            
        System.out.println("Ingrese 1 para depositos - 2 para extracciones");
        int num=sc.nextInt();
        if(num==1){
                System.out.println("Ingrese monto a depositar:");                 
                ca.Depositar(sc.nextDouble());
                System.out.println("Informacion de su cuenta:" + ca.toString());
                }
        else{
            System.out.println("Ingrese monto a extraer:");                 
                ca.Extraer(sc.nextDouble());
                System.out.println("Informacion de su cuenta:" + ca.toString());}
        }
    }
        }
        
        
        
        
    }
    

