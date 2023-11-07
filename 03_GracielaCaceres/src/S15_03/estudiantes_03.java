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
public class estudiantes_03 {
        // Atributos
    String nombre;
    String apellido;
    int edad;
    String ciudadOrigen;

    // Metodos
    public void caminar() {
        System.out.println("caminar");
    }

    public void correr() {
        System.out.println("nombre");
    }
    
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Nombre de la persona: " + nombre);
        JOptionPane.showMessageDialog(null, "Edad de la persona: " + edad);
        JOptionPane.showMessageDialog(null, "Ciudad de origen de la persona: " + ciudadOrigen);
    }
    
    public void preguntar() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona: ");
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad de la persona: ");
        edad = Integer.parseInt(edadStr);
        ciudadOrigen = JOptionPane.showInputDialog("Ingrese la ciudad de origen de la persona: ");
    }
 

}
