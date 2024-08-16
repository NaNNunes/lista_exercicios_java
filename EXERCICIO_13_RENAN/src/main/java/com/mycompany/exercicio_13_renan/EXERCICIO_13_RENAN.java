/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_13_renan;

/**
 ** @author renan
 * Verificação de Ano Bissexto: Crie um programa que solicite ao usuário um ano e utilize
    IF-ELSE para verificar se ele é bissexto. O programa deve seguir as regras de divisibilidade
    para determinar o resultado.
 */
import java.util.Scanner;
public class EXERCICIO_13_RENAN {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int year;
        String result;
        
        System.out.printf("Enter a year: ");
        year = read.nextInt();
        
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            result = "leap year";
        }
        else {
            result = "Common year";
        }
        
        System.out.printf("%d was a %s", year, result);
    }
}
