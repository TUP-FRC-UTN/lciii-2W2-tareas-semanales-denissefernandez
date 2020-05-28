
package ejercicio3.fabrica;

import java.util.Scanner;
public class Ejercicio3Fabrica {

   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese producto:");
        String prod=sc.nextLine();
        System.out.println("Cantidad de materiales del producto:" +" "+prod);
        int cant=sc.nextInt();
        
        Producto p = new Producto(prod,cant);
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese descripcion del material:");
            String desc=sc.next();
            sc.nextLine();
            System.out.println("Ingrese codigo del material:" + desc);
            int cod=sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese valor unitario del material:" + desc);
            double valor=sc.nextDouble();
            
            Material m = new Material(desc,cod,valor);  
        
            p.agregarproducto(m);}
        
        System.out.println("INFORMACION");
        
        System.out.println("Costo total del producto:");
        System.out.println("$"+p.returnCosto());        
        System.out.println("Ingrese codigo del material:");
        System.out.println(p.Existe(sc.nextInt()));      
        System.out.println("Ingrese valor unitario:");
        double valor=sc.nextDouble();
         Material [] m1= p.materialesSegunParametro(valor);
        System.out.println("Materiales cuyo valor es menor a" +" "+ valor);
       
        for (int i = 0; i < m1.length; i++) {
            if(m1[i]!= null)
                System.out.println(m1[i].toString());            
        }      
        sc.nextLine();
        int [] m2= p.cantMatPorPrecio();  
        System.out.println("Cantidad de materiales menores a $10:");
        for (int i = 0; i < m2.length; i++) {
            System.out.println(m2[0]);  
            break;
        }
        System.out.println("Cantidad de materiales menores a $20:");
        for (int i = 0; i < m2.length; i++) {
            System.out.println(m2[1]);  
            break;
        }
        System.out.println("Cantidad de materiales menores a $30:");
        for (int i = 0; i < m2.length; i++) {
            System.out.println(m2[2]); 
            break;
        }
        System.out.println("Cantidad de materiales mayores a $30:");
        for (int i = 0; i < m2.length; i++) {
            System.out.println(m2[3]);   
            break;
        }
       
              
        
        
                
        
    }
    
}
