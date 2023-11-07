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
public class Main_S15_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculadora_03 calculadora = new calculadora_03();
        calculadora.preguntar();
        calculadora.sumar();
        calculadora.resta();
        calculadora.multiplicar();
    }
   
      public static void main(String[] args) {
        gato_03 gato = new gato_03();
        gato.preguntar();
        gato.mostrarInfo();
    }
     
       public static void main(String[] args) {
        estudiantes_03 persona = new estudiantes_03();
        persona.preguntar();
        persona.mostrarInfo();

        int edadPersona = persona.edad;
        int edadEnMeses = edadPersona * 12;
        int edadEnDias = edadPersona * 365; 

        JOptionPane.showMessageDialog(null, "Edad de la persona en meses: " + edadEnMeses);
        JOptionPane.showMessageDialog(null, "Edad de la persona en días: " + edadEnDias);
      
}
