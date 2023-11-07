/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S15_03;

import java.util.Scanner;

/**
 *
 * @author Usuario13
 */
public class calculadora_03 {
    //atributos
     int a; 
     int b;
     int totals;
     int totalr;
     int totalm;
     
//metodo
     
    public void preguntar(){
        Scanner o =new Scanner(System.in);
     System.out.println("Ingrese el primer número: ");   
     a = o.nextInt();
   
    System.out.println("Ingrese el segundo número: ");
     b = o.nextInt();
    
    }
     
    public void multiplicar (){
      totalm = a * b;
      System.out.println("La multiplicaion es" + totalm);
    }
    
      public void sumar (){
      totals = a + b;
      System.out.println("la suma es" + totals);
    }
    
    public void resta(){
    totalr = a+b;
        System.out.println("La resta es: "+totalr);
    }
      
      
  } 
