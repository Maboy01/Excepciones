/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcioness;

import javax.swing.JOptionPane;

public class Excepcion {

    public static void main(String[] args) {
        A();
    }

    public static void A() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el denominador"));
        double aux;
        try {
            aux = a / b;
            JOptionPane.showMessageDialog(null, aux);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
