/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcioness;

/**
 *
 * @author LENOVO
 */
public class Excepcionvector {

    public static void main(String[] args) {
        desborde();
    }

    public static void desborde() {
        //Definir un vector de 3 posiciones
        int v[] = new int[3];
        try {
            //Se recorre el vector hasta la posicion 6
            for (int i = 0; i < 6; i++) {
                v[i] = i;
            }
            //El vector no tiene posicion 6 entonces el catch utiliza la excepcion para dar el mensaje que no tiene mas posiciones que 3
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

}
