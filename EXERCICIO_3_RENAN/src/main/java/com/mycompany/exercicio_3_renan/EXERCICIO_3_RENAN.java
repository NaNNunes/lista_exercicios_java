/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_3_renan;

/**
 *
 * @author renan
 */

/*
Calculadora Simples: Crie uma calculadora que permita ao usuário escolher entre as
operações básicas (adição, subtração, multiplicação e divisão). Utilize IF-ELSE para
determinar a operação escolhida e execute-a com base nos números inseridos pelo usuário.
*/
import java.util.Scanner;
public class EXERCICIO_3_RENAN {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float[] numbers =  new float[3];
        int input;
        char operator = ' ';
        boolean isValid = false;
        
        for (int i = 0; i < numbers.length - 1; i++){
            System.out.printf("Enter the %d number: ",i+1);
            numbers[i] = read.nextFloat();
        }
        
        while (isValid == false ){
            System.out.println("[1] - Sum \n[2] - Subtraction \n[3] - Division \n[4] - Multipliccation");
            System.out.printf("Chose the operator: ");
            input = read.nextInt();
            
            if (input == 1){
               operator = '+';
               numbers[2] = numbers[0] + numbers[1];
            }
            else if (input == 2){
                operator = '-';
                numbers[2] = numbers[0] - numbers[1];
            }
            else if (input == 3){
                operator = ':';
                numbers[2] = numbers[0] / numbers[1];
            }
            else if (input == 4){
                operator = 'x';
                numbers[2] = numbers[0] * numbers[1];
            }
            else {
                System.out.println("--- Invalid Operator! ---\n");
            }
            
            if (input < 5 && input > 0){
                isValid = true;
            }
        }
        
        System.out.printf("\n%.2f %c %.2f = %.2f", numbers[0], operator, numbers[1], numbers[2]);
    }
}
