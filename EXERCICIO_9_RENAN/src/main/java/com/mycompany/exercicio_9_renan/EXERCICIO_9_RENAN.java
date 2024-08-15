/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_9_renan;

/**
 ** @author renan
 * Verificação de Números Primos: Crie um programa que solicite ao usuário um número e
    utilize um laço FOR para verificar se o número é primo. Utilize IF para determinar se ele é
    divisível por outros números além de 1 e ele mesmo.
 */
import java.util.Scanner;
public class EXERCICIO_9_RENAN {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number, checking = 0; 
        
        System.out.printf("Enter a number: ");
        number = read.nextInt();
        
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                checking ++;
            }
        }
        
        if (checking == 2){
            System.out.printf("The number %d is a prime number.", number);
        }
        else {
            System.out.printf("The number %d is non-prime number.", number);
        }
    }
}
