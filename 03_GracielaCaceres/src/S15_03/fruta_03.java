/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S15_03;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario13
 */
public class fruta_03 {
        // Atributos
    String nombre;
    String color;
    int cantidad;
    String sabor;
    String ciudadOrigen;

    // Metodos
    public void nombre() {
        System.out.println("nombre");
    }

    public void color() {
        System.out.println("color");
    }
    
    public void sabor() {
         System.out.println("sabor");
    }

    public void ciudadOrigen() {
          System.out.println("Ciudad de Origen");
    }
    
    public void preguntar() {
        JOptionPane.showMessageDialog(null, "Nombre de la fruta: " + nombre);
        JOptionPane.showMessageDialog(null, "Sabor de la fruta: " + sabor);
        JOptionPane.showMessageDialog(null, "Color de la fruta: " + color);
    }
    
 

}
