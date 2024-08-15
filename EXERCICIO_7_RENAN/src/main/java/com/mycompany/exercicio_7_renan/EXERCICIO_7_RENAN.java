/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_7_renan;

/**
 *  @author renan
 *  Contagem de Números Pares e Ímpares: Crie um programa que solicite ao usuário um
 *  número e utilize um laço FOR para percorrer todos os números de 1 até o número inserido.
 *  O programa deve contar e exibir a quantidade de números pares e ímpares.
 */
import java.util.Scanner;
public class EXERCICIO_7_RENAN {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = 0, evenCounter = 0, oddCounter = 0;
        
        do{
            System.out.printf("Enter a number: ");
            number = read.nextInt();
            
            if (number < 1){
                System.out.println("Invalid value!\n Please enter a value grater than 1!");
            }
        }while(number < 1);
        
        for (int i = 1; i <= number; i++){
            if (i % 2 == 0){
                evenCounter ++;
            }
            else{
                oddCounter ++;
            }
        }
        
        System.out.printf("Between 1 and %d there are:\n", number);
        System.out.printf("Even numbers: %d\nOdd numbers: %d", evenCounter, oddCounter);
    }
}
