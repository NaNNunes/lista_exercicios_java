/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_5_renan;

/**
 *
 * @author renan
 */

/*
    Tabuada Personalizada: Crie um programa que solicite ao usuário um número e gere a
    tabuada desse número de 1 a 10 utilizando um laço FOR. O programa deve exibir o
    resultado de cada multiplicação.
*/
import java.util.Scanner;
public class EXERCICIO_5_RENAN {

    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       float number, result;
       
       System.out.printf("Enter a number: ");
       number = read.nextFloat();
       
        System.out.println("The multipkication table is: ");
       for (int i = 1; i <= 10; i++){
           result = number * i;
           System.out.printf("%.2f x %2d = %3.2f\n", number, i, result);
       } 
    }
}
