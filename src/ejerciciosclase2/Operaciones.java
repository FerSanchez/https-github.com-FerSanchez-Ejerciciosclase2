package ejerciciosclase2;


import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fernando
 */
public class Operaciones {
    
      public Operaciones()
    {
        
    }
    
      public static void Ejercicio1()
      {

       Random rnd = new Random();   
       int random= (int)(rnd.nextDouble() * 6 + 1);
       
       Random rnd2 = new Random();   
       int random2= (int)(rnd2.nextDouble() * 6 + 1);
       
       Random rnd3 = new Random();   
       int random3= (int)(rnd3.nextDouble() * 6 + 1);
       System.out.print("Los numeros del random son: ");
       System.out.print(random+", ");
       System.out.print(random2+", ");
       System.out.print(random3+", ");
      
    
  if(random == 6 && random2==6 && random3 ==6)
  {
       
   System.out.println("Excelente");
        
    }
  
  if(random == 6 && random2!=6 && random3 != 6)
  {
       
   System.out.println("Regular");
        
    }
  if(random != 6 && random2==6 && random3 != 6)
  {
       
   System.out.println("Regular");
        
    }
  if(random != 6 && random2!=6 && random3 == 6)
  {
       
   System.out.println("Regular");
        
    }
  
    if(random == 6 && random2==6)
  {
       
   System.out.println("Muy bien");
        
    }
    
    if(random2 == 6 && random3==6)
  {
       
   System.out.println("Muy bien");
        
    }
    if(random2 == 6 && random3==6)
  {
       
   System.out.println("Muy bien");
        
    }
  
  if(random != 6 && random2 != 6 && random3 != 6)
  {
       
   System.out.println("Pesimo");
        
    }
     System.exit(0); 
  }
      
      public static void Ejercicio2()
      {
         
        int num;
        Scanner leer = new Scanner(System.in);
        String numero = "Los numeros validos son: ";
        int n= 0;
        for (int i=1; i<=5; i++) 
        {
        System.out.println("Ingrese numero mayor a 20");
        num = leer.nextInt();    
        if(num%2!=0)
        {
           i--;     
        }
        if (num>=20)
        {
            numero = numero + num +" ";
            n = n + num;
        }
        }
        System.out.println(numero);
        System.out.println("El total es: " + n);
        
      }
      
       public static void Ejercicio3()
      {
       Random rnd = new Random();   
       int random= (int)(rnd.nextDouble() * 6 + 1);
       
       Random rnd2 = new Random();   
       int random2= (int)(rnd2.nextDouble() * 6 + 1);
       int intento=5;
       int resultado= random*random2;
       
       for(int i=0; i<5; i++){
        System.out.println("Tienes " + intento + " intentos para encontrar el resultado de la multiplicacion");
        intento--;
        System.out.println("El resultado es(solo para probar):"+ resultado); 
        System.out.print("Escribe un numero: ");
        Scanner leer= new Scanner(System.in);
        int num= leer.nextInt();
        
        
        
        if(num==resultado)
        {
        System.out.println("Excelentes has encontrado el resultado"); 
        System.exit(0); 
        
        }
       if(intento==0){
           System.out.println("Has perdido vuelve a intentarlo");
           System.out.println("El resultado era: "+ resultado); 
           System.exit(0); 
           
          
       }
       
      }
      }
       
        public static void Ejercicio4()
      {
        
           Scanner read=new Scanner(System.in);

           System.out.println("Ingrese dimensión de la serie: ");
           int dim=read.nextInt();          
                    for(int i=0; i<dim; ++i)
                    {
                        for(int j=0; j<=i; ++j)
                         {
                        System.out.print("*");
                         }
                             
                    System.out.println();
                     }
                    
                    
           } 
        
      
        
         public static void Ejercicio5()
      {
          int aleatorio=(int)(Math.random()*100);
          
          Scanner entrada= new Scanner(System.in);
          int numero=0;
          int intentos=0;
          
          do{
          intentos++;
           System.out.print("Ingresa un numero: ");
           numero=entrada.nextInt();
           if(aleatorio<numero)
           {
             System.out.println("El numero buscado es menor");  
           }
           else if(aleatorio>numero)
           {
              System.out.println("El numero buscado es mayor"); 
           }
           
          }while(numero!=aleatorio);
          System.out.println("Felicidadez has ganado! en tan solo "+intentos+" intentos");
              
              
          
        }
         
          public static void Ejercicio6()
      {
        System.out.println("Este programa calcula la tasa de interes de la tarjetad de credito que adeudo $6,000");
       
        double adeudo=6000;
        double interes=0.15;
        double calculo=adeudo*interes;
        int contador=0;
        System.out.println("El 15% interes de la tarjeta es de :$"+calculo+"0");
        double resultado=0;
        
      for(int i=6000;i<=55000;i+=calculo)
      {       
        contador++;
      }
      
      System.out.println("Se pagagaron: "+contador +" meses con intereses del 15% para que superara los $55,000.00 pesos");
        }
}


        
         
              
       
    
