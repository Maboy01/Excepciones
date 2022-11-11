/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcioness;

/**
 *
 * @author LENOVO
 */
public class Excepcioness {

    public static void main(String[] args) {
        int numero;
        String cadena = "a";
        //Hace el proceso de ver si el numero es entero
        try {
            numero = Integer.parseInt(cadena);
            // El catch es para la excepcion que ocurre a la hora de que ocurra que el numero no es entero
        } catch (NumberFormatException ex) {
            System.out.println("No es un numero, es una cadena de texto" + ex.getMessage());
        }

    }

}
