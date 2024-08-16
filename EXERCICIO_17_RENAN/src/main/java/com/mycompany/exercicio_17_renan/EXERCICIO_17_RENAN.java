/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_17_renan;

/**
 ** @author renan
 * Contagem de Vogais: Crie um programa que solicite ao usuário uma frase e utilize um
    laço FOR para contar o número de vogais presentes. Utilize IF para verificar cada caractere e
    determinar se é uma vogal.
 */
import java.util.Scanner;
public class EXERCICIO_17_RENAN {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int counterVowels = 0; 
        String sentence;
        char letter;
        System.out.println("Write a sentence:");
        sentence = read.nextLine().toLowerCase();
        
        for (int i = 0; i < sentence.length(); i++){
            letter = sentence.charAt(i);
            if ( letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                counterVowels ++;
            }
        }
        System.out.printf("The sentence : %s\n", sentence);
        System.out.printf("It has: %d vowels", counterVowels);
    }
}
