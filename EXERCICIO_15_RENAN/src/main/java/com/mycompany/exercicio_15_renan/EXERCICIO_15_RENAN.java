/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_15_renan;

/**
 ** @author renan
 * Cálculo de Fatorial: Crie um programa que solicite ao usuário um número e utilize um
    laço FOR para calcular o fatorial desse número. O programa deve exibir o resultado ao final
 */
import java.util.Scanner;
public class EXERCICIO_15_RENAN {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number, factorial = 1;
        
        System.out.printf("Enter a number: ");
        number = read.nextInt();
        
        for (int i = number; i > 0; i--){
            factorial *= i;
        }
        
        System.out.printf("%d! = %d", number, factorial);
    }
}
