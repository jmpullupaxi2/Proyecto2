/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2;
import java.util.Scanner;

/**
 *
 * @author JUAN
 */

public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int cantidad;
        float precio, total=0, descuento, pagofinal;
        System.out.print("Ingrese la cantidad de de productos comprados: ");
        cantidad= sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el precio del producto " +(i+1)+": ");
            precio= sc.nextFloat();
            total = total+precio;         
        }
        if (total<100){
            System.out.println("Su total a pagar no tendra descuento");
            System.out.println("Su pago final es de: "+ total);           
        }else{
            if (total<200){
                pagofinal=total-(total*0.05f);
                System.out.println("Su descuento sera de 0.05");
                System.out.println("Pago sin descuento: "+ total);
                System.out.println("Su pago final con descuento es de: "+ pagofinal);
        } else {
                if(total<300){
                  pagofinal=total-(total*0.10f);
                  System.out.println("Su descuento sera de 0.10");
                  System.out.println("Pago sin descuento: "+ total);
                  System.out.println("Su pago final con descuento es de: "+ pagofinal);                  
                }else{ 
                   pagofinal=total-(total*0.15f);
                  System.out.println("Su descuento sera de 0.15");
                  System.out.println("Pago sin descuento: "+ total);
                  System.out.println("Su pago final con descuento es de: "+ pagofinal);  
                }
            }
        }
        sc.close();
    }  
}
