/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_1_renan;

/**
 *
 * @author renan
 */

/*
    Sistema de Aprovação de Alunos: Crie um programa que receba as notas de um aluno em
    três disciplinas e calcule sua média. Utilize estruturas IF e ELSE para determinar se o aluno
    foi aprovado, reprovado ou está em recuperação com base na média (Aprovado: média ≥ 7,
    Recuperação: 5 ≤ média < 7, Reprovado: média < 5).
*/
import java.util.Scanner;
public class EXERCICIO_1_RENAN {

    public static void main(String[] args) {
        // to input
        Scanner read = new Scanner(System.in);
        
        float[] grades = new float[3];
        float avarage, sumGrades = 0;
        String result;
        // start
        for (int i = 0; i < grades.length; i++){
            System.out.printf("Write the grades of the %d Subject: ", i+1);
            grades[i] = read.nextFloat(); // input
            sumGrades += grades[i];
        }
        avarage = sumGrades / grades.length;
        if (avarage < 5){
            result = "Failed";
        }
        else if (avarage < 7){
            result = "Resovery";
        }
        else {
            result = "Approved";
        }
        //output
        System.out.printf("Avarage: %2.2f\nResult: %S", avarage, result);
    }
}
