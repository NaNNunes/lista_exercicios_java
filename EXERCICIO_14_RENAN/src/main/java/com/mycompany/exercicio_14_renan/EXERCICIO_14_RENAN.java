/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_14_renan;

/**
 ** @author renan
 * Jogo do Par ou Ímpar: Desenvolva um jogo em que o usuário escolhe um número e o
    programa sorteia outro número aleatório. Utilize IF-ELSE para determinar se a soma dos
    dois números é par ou ímpar, e declare o vencedor com base na escolha do usuário
 */
import java.util.Scanner;
import java.util.Random;
public class EXERCICIO_14_RENAN {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner read = new Scanner(System.in);
        
        final int numFingers = 11; // decimal system 0 - 9, 10 fingers :)
        
        int pc, player;
        int pcChoice, playChoice;
        pc = rand.nextInt(numFingers);
        
        System.out.println("Chose [1]Odd - [2] Even");
        playChoice = read.nextInt();
        
        if (playChoice < 1 || playChoice > 2){
            System.out.println("Ok, i choose");
            pcChoice = rand.nextInt(2);
            pcChoice += 1;
            
            if (pcChoice == 1){
                playChoice = 2;
                System.out.println("- I choose odd numbers. - \n- You are even numbers. -");
            }
            else {
                playChoice = 1;
                System.out.println("- I choose even numbers. - \n- You are odd number");
            }
        }
        else if (playChoice == 1){
            pcChoice = 2;
            System.out.println("- I'm even numbers. -");
        }
        else {
            pcChoice = 1;
            System.out.println("- I'm odd numbers. -");
        }
        
        System.out.printf("Enter a number: ");
        player = read.nextInt();
        System.out.printf("You: %d \nPC: %d\n- %d + %d = %d\n", player, pc, player, pc, player + pc);
        
        if (player + pc % 2 == 0){
            if (playChoice == 2){
                System.out.println("-- Congratulations, You Win! --");
            }
            else {
                System.out.println("-- I Win! --");
            }
        }
        else{
            if (playChoice == 1){
                System.out.println("-- Congratulation, You Win! --");
            }
            else{
                System.out.println("-- I Win! --");
            }
        }
    }
}
