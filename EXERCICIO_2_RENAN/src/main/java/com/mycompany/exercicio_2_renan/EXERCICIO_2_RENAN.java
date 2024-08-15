/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_2_renan;

/**
 *
 * @author renan
 */

/*
Jogo de Adivinhação: Desenvolva um programa em que o computador escolhe um número
aleatório entre 1 e 100, e o usuário tem que adivinhar. Utilize um laço WHILE para permitir
múltiplas tentativas até que o usuário acerte, e IF-ELSE para fornecer dicas (se o número é
maior ou menor).
*/
import java.util.Random;
import java.util.Scanner;
public class EXERCICIO_2_RENAN {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner read = new Scanner(System.in);
        
        final int limit = 101;
        
        int numDrawn;
        int guess = 0;
        
        numDrawn = rand.nextInt(limit);
        if (numDrawn == 0){
            numDrawn += 1;
        }
        
        while (guess != numDrawn){
            System.out.printf("Guess a number: ");
            guess = read.nextInt();
            
            if (guess < numDrawn){
                System.out.println("The number drawn is higher.");
            }
            if (guess > numDrawn) {
                System.out.println("The number drawn is smaller");
            }
        }
        System.out.println("Congratulations you found the number.");
        
    }
}
