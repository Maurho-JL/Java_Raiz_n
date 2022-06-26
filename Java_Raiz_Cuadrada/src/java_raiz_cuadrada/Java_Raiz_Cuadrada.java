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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese el radicando de la raiz cuadrada: ");
        float radicando=sc.nextFloat();
        System.out.print("Ingrese la raiz de ");
        float raiz = sc.nextFloat();
        double resultado = Math.pow(radicando, (1/raiz));
        System.out.println("Resultado: "+ resultado);   
    }
    
}
