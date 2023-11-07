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
public class profesor_03 {
    String nombre;
    String apellido;
    int edad;
    String sexo;
    String ciudadOrigen;
    

    public void nombre() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
        
    }
    public void apeliido() {
       apellido = JOptionPane.showInputDialog("Ingrese la apellido del profesor: ");
    }

    public void edad() {
        JOptionPane.showMessageDialog(null, "Edad del profesor: " + edad);
    }
    public void ciudadOrigen() {
        JOptionPane.showMessageDialog(null, "Ciudad del profesor: " + ciudadOrigen);
    }
    
     public void sexo() {
        JOptionPane.showMessageDialog(null, "Sexo del profesor: " + sexo);
    }
    
}

