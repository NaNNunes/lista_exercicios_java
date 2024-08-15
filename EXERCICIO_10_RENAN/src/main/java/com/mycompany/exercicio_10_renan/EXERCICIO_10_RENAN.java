/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_10_renan;

/**
 ** @author renan
 * Contagem Regressiva: Desenvolva um programa que exiba uma contagem regressiva de
    10 até 0, utilizando um laço WHILE. O programa deve exibir cada número em sequência até
    alcançar o zero.
 */

public class EXERCICIO_10_RENAN {

    public static void main(String[] args) {
        int number = 10;
        while (number >= 0){
            System.out.printf("%d",number);
            if (number > 0){
                System.out.printf(", ");
            }
            else {
                System.out.printf("... ");
            }
            number --;
        }
        System.out.println("End!");
    }
}
