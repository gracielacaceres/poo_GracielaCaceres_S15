/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S15_03;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario13
 */
public class carro_03 {
 
 //Atributos
    String modelo;
    String color;
    int kl;
 
    
//Metodos
    
    
    public void preguntar(){
    modelo = JOptionPane.showInputDialog("¿Qué modelo es el carro? ") ;
    color = JOptionPane.showInputDialog("¿Qué color tiene el carro? ") ;
    }
    
   public void responde(){
   JOptionPane.showMessageDialog(null,"El carro es: " + modelo + " , recorre : "+ kl +"y es de color: " + color +".");
   }

}
         
      
