/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_11_renan;

/**
 ** @author renan
 * Conversor de Temperatura: Crie um programa que converta uma temperatura de
    Celsius para Fahrenheit e vice-versa. O programa deve solicitar ao usuário a temperatura e
    a unidade de origem, e utilizar IF-ELSE para realizar a conversão correta.
 */
import java.util.Scanner;
public class EXERCICIO_11_RENAN {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char[] unitSym = new char[2];
        float[] number = new float[2];
        int unitMeasure;
        boolean isValid = false;
        
        System.out.printf("Enter a temperature: ");
        number[0] = read.nextFloat();
        
        while (isValid == false){
            System.out.println("Enter the original unit of measurement:\n[1] - Celsius | [2] - Fahrenheit");
            unitMeasure = read.nextInt();

            if (unitMeasure == 1){
                unitSym[0] = 'C';
                unitSym[1] = 'F';
                number[1] = (number[0] * 9/5) + 32;
                isValid = true;
            }
            else {
                unitSym[0] = 'F';
                unitSym[1] = 'C';
                number[1] = (number[0] - 32) * 9/5;
                isValid = true;
            }
            if (isValid != true){
                System.out.println("Please hoose a avaliabe unit measure");
            }
        }
        
        System.out.printf("%.1f %C = %.1f %C", number[0], unitSym[0] ,number[1], unitSym[1]);
    }
}
