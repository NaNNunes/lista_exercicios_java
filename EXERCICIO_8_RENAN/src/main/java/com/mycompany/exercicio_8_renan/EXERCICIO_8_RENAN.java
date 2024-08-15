/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_8_renan;

/**
 ** @author renan
 * Sistema de Senha: Desenvolva um programa que solicite ao usuário uma senha e utilize
    IF-ELSE para verificar se ela atende aos critérios de segurança (mínimo de 8 caracteres). O
    programa deve permitir ao usuário tentar novamente até que uma senha válida seja
    inserida.
 */
import java.util.Scanner;
public class EXERCICIO_8_RENAN {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        final int minLength = 8;
        String passWord;
        
        do{
            System.out.printf("Enter password: ");
            passWord = read.nextLine();
            
            if (passWord.length() < minLength){
                System.out.println("This password doesn't meet the minimum security criteria, 8 characteres!");
                System.out.println("Please Try again.");
            }else{
                System.out.println("+++ Registered Password. +++");
            }
        } while (passWord.length() < minLength);
    }
}
