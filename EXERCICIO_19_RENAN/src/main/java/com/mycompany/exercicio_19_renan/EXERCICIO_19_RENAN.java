/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_19_renan;

/**
 ** @author r.nunes
 * Cálculo de Potência: Crie um programa que solicite ao usuário a base e o expoente, e
    utilize um laço FOR para calcular a potência (base^expoente). O programa deve exibir o
    resultado ao final.
 */
import java.util.Scanner;

public class EXERCICIO_19_RENAN {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float[] number = {0, 0, 1};
        
        System.out.printf("Enter the base number of exponentation: ");
        number[0] = read.nextInt();
        System.out.printf("Enter the exponent: ");
        number[1] = read.nextInt();
        
        if (number[1] > 0){
            for (int i = 0; i < number[1]; i++){
                number[2] *= number[0]; 
            }
            System.out.printf("Result: %.2f", number[2]);
        }
        else if (number[1] == 0){
            number[2] = 1;
            System.out.printf("Result: %.0f", number[2]);
        }
        else {
            int aux = 10;
            number[1] = -number[1];
            for (int i = 0; i < number[1]; i++){
                aux *= 10;
            }
            number[2] = number[0] / aux;
            System.out.printf("Result: %f", number[2]);
        }
    }
}
