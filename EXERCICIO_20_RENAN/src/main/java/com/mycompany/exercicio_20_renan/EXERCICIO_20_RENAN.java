/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_20_renan;

/**
 ** @author r.nunes
 * Cálculo de Desconto: Desenvolva um programa que solicite ao usuário o valor de uma
    compra e o percentual de desconto. Utilize IF-ELSE para aplicar o desconto correto e exibir
    o valor final ao usuário.
 */
import java.util.Scanner;
import java.util.Random;
public class EXERCICIO_20_RENAN {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random rand = new Random();
        
        int choice;
        float value;
        float result;
        
        do {
            System.out.printf("Enter the purchase price: R$ ");
            value = read.nextFloat();
            if (value <= 0 || value > 100){
                System.out.println("Invalid value");
            }
        }while (value <= 0 || value > 100);
        
        
        do {
            System.out.printf("Enter the discount percentege: ");
            choice = read.nextInt();

            if (choice < 100 && choice >= 0){
                value = value - (value * choice/100);
                System.out.printf("Final Value: %.2f", value);
            }
            else{
                System.out.println("Invalid Value");
            }
        } while (choice > 100 || choice < 0);
            
            
    }
}
