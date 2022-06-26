/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_raiz_cuadrada;

import java.util.Scanner;

/**
 *
 * @author syste
 */
public class Java_Raiz_Cuadrada {

    static float radicando = 0, raiz = 0;

    static void obtener_datos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radicando de la raiz cuadrada: ");
        radicando = sc.nextFloat();
        System.out.print("Ingrese la raiz de ");
        raiz = sc.nextFloat();
    }

    static double operacion() {
        double resultado = 0;
        resultado = Math.pow(radicando, (1 / raiz));
        return resultado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        obtener_datos();
        System.out.println("Resultado: " + operacion());

    }

}
