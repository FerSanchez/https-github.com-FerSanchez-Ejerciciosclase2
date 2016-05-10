/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosclase2;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author fernando
 */
public class Ejerciciosclase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Menu:");
        System.out.println("1.Dados");
        System.out.println("2.Numeros Pares");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Dibujar Series");
        System.out.println("5.Adivinanza");
        System.out.println("6.Tarjeta credito");
        System.out.print("Escriba el numero del ejercicio a realizar:");
        Scanner leer= new Scanner(System.in);
        int opcion= leer.nextInt();
        
   
        Operaciones ejercicios = new Operaciones(); 
   
        
        switch (opcion) {
        case 1:
            ejercicios.Ejercicio1();
        break;

        case 2:
            ejercicios.Ejercicio2();
        break;
        
        case 3:
             ejercicios.Ejercicio3();
        break;
        
        case 4:
             ejercicios.Ejercicio4();
        break;
        
        case 5:
            ejercicios.Ejercicio5();
        break;
        
        case 6:
             ejercicios.Ejercicio6();
        break;





 }
      
  
        
        
       
    }
    
}
