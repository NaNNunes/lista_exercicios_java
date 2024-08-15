/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_4_renan;

/**
 *
 * @author renan
 */

/*
    Sistema de Login: Desenvolva um programa que simule um sistema de login simples. O
    programa deve solicitar o nome de usuário e senha, e permitir até 3 tentativas. Utilize
    WHILE para controlar o número de tentativas e IF-ELSE para verificar a autenticidade dos
    dados.
*/
import java.util.Scanner;
public class EXERCICIO_4_RENAN {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        final int minLength = 4, maxLength = 8;
        
        int attemptLimit = 3;
        boolean check = false;
        
        String[] userCredential = new String[3];
        String[] input = new String[2];
        
        System.out.println("---------- REGISTER ----------");
        System.out.printf("Enter User name: ");
        userCredential[0] = read.nextLine();
        
        // confirm p.w
        do {
            // optimal p.w
            do{
                System.out.printf("Enter password: ");
                userCredential[1] = read.nextLine();
                
                if (userCredential[1].length() < 4 || userCredential[1].length() > maxLength){
                    System.out.println("--- password must be 4 to 8 characteres ---");
                }
            } while (userCredential[1].length() < minLength || userCredential[1].length() > maxLength);
            
            System.out.printf("Confirm password: ");
            userCredential[2] = read.nextLine();
            // p.w comparison
            if (userCredential[1].equals(userCredential[2]) == false){
                System.out.println("--- Unsupported password ---");
            }
            else {
                System.out.println("----- REGISTERED USER -----");
            }
        } while (userCredential[1].equals(userCredential[2]) != true);
        System.out.println("------------------------------");
        
        System.out.println("----------- SING UP -----------");
        while (attemptLimit > 0 || check == true){
            System.out.printf("User Name: ");
            input[0] = read.nextLine();
            System.out.printf("Password: ");
            input[1] = read.nextLine();
            
            if (input[0].equals(userCredential[0]) && input[1].equals(userCredential[1])){
                check = true;
                break;
            }
            else{
                attemptLimit --;
                System.out.println("!UNSUPPORTED CREDENTIALS!");
                
                if (attemptLimit > 0){
                    System.out.printf("=+ %d attempt remaining +=\n",attemptLimit);
                }
                else{
                    System.out.println("NO MORE TRIES.");
                }
            }
            
        }
        
        if (check == true){
            System.out.printf(" --- WELCOME %s! ---\n", input[0]);
        }
        System.out.println("------------------------------");
    }
}
