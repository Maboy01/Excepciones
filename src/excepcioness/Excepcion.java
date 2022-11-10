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
        try {
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el divisor"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el dividendo:"));
            int aux;
            if (n2 < 10) {
                aux = n1 / n2;
                JOptionPane.showMessageDialog(null, aux);
            } else {
                throw new Nuevaexcepcion("Solo numeros menores a 10");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Es una cadena de texto, tiene que ser un numero");
        } catch (ArithmeticException a) {
            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
