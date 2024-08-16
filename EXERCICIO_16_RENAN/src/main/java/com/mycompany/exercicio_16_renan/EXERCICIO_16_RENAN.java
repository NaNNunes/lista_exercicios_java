/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_16_renan;

/**
 ** @author renan
 * Verificação de Palíndromo: Desenvolva um programa que solicite ao usuário uma
    palavra e utilize um laço FOR para verificar se ela é um palíndromo. Utilize IF para
    comparar os caracteres da palavra e determinar o resultado.
 */
import java.util.Scanner;
public class EXERCICIO_16_RENAN {

    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       
       String word;
       int counter = 0;
       
        System.out.printf("Write a word: ");
        word = read.nextLine().toLowerCase();
        counter = word.length() - 1;
        
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == word.charAt(counter)){
                counter --;
            }
        }
        if (counter == -1){
            System.out.printf("%s is a palindrome.", word);
        }
        else{
            System.out.printf("%s isn't a palindrome.", word);
        }
    }
}
