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
        String cadena = "1";
        try {
            numero = Integer.parseInt(cadena);
        } catch (NumberFormatException ex) {
            System.out.println("No es un numero, es una cadena de texto"+ex.getMessage());
        }

    }

}
