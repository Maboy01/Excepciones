/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcioness;

public class ExcepcionDivision {

    public static void main(String[] args) {
        aritmetico();
    }

    public static void aritmetico() {
        int numero = 5, resultado;
        try {
            //Se divide en 0 el numero 5
            resultado = numero / 0;
            //El catch actua con la ArithmeticException para ver que hay un error en la operacion
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0 " + "\n " + e.getMessage());
        }

    }

}
