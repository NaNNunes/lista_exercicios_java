/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_6_renan;

/**
 *
 * @author renan
 */

/*
    Cálculo de IMC: Desenvolva um programa que calcule o Índice de Massa Corporal (IMC)
    de uma pessoa. O programa deve solicitar o peso e a altura do usuário, calcular o IMC e usar
    IF-ELSE para classificar o resultado (baixo peso, peso normal, sobrepeso, obesidade).
*/
import java.util.Scanner;
public class EXERCICIO_6_RENAN {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String result;
        float height = 0, weight = 0;
        float bmi;
        boolean isValid = false;
        
        while (isValid == false){
            System.out.printf("Enter your height in meters: ");
            height = read.nextFloat();
            System.out.printf("Enter your wheight in kilogran: ");
            weight = read.nextFloat();
            
            //validation
            if (weight > 600 || weight < 0.25 || height > 3 || height < 0.3){
                System.out.println("Values not accepted");
            }
            else {
                isValid = true;
            }
        }
        
        bmi = weight / (height * height);
        if (bmi < 18.5){
            result = "UnderWeight";
        }
        else if (bmi < 25){
            result = "Normal";
        }
        else if (bmi < 30){
            result = "OeverWeight";
        }
        else{
            result = "Obesity";
        }
        
        System.out.printf("Body Mass Index: %.2f\n", bmi);
        System.out.printf("Status: %S", result);
    }
}
