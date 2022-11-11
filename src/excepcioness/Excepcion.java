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
            //Se definen el divisor, dividendo y un aux para la division
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el entero"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el dividendo:"));
            int aux;
            //Se hace un if que el entero  sea mayor a 10
            if (n1 <= 10) {
                aux = n1 / n2;
                JOptionPane.showMessageDialog(null, aux);
            } else {
                //En el else llamamos a nuestra nueva excepcion que creamos en la otra clase
                throw new Nuevaexcepcion("Solo numeros mayores a 10");
            }
        } catch (NumberFormatException ex) {
            //Un Excepcion para que avise al usuario que no puede meter texto
            JOptionPane.showMessageDialog(null, "Es una cadena de texto, tiene que ser un numero");
        } catch (ArithmeticException a) {
            //Una excepcion que le dice al usuario que no puede colocar el dividendo en 0
            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
        } catch (Exception e) {
            //Esta excepcion conecta con nuestra nueva excepcion
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
