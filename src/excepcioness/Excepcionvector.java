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
        int v[] = new int[3];
        try {
            for (int i = 0; i < 6; i++) {
                v[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

}
