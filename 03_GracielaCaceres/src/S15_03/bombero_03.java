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
public class bombero_03 {
    String nombre;
    String apellido;
    int edad;
    int estatura;
    String cargo;
    
    

    public void nombre() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
        
    }
    public void apeliido() {
       apellido = JOptionPane.showInputDialog("Ingrese la apellido del profesor: ");
    }

    public void edad() {
        JOptionPane.showMessageDialog(null, "Edad del profesor: " + edad);
    }
    public void estatura() {
        JOptionPane.showMessageDialog(null, "Ciudad del profesor: " + estatura);
    }
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Nombre del bombero: " + nombre);
        JOptionPane.showMessageDialog(null, "Apellido del bombero: " + apellido);
        JOptionPane.showMessageDialog(null, "Edad del bombero: " + edad);
        JOptionPane.showMessageDialog(null, "Estatura del bombero: " + estatura);
        JOptionPane.showMessageDialog(null, "Cargo del bombero: " + cargo);
    }
}
