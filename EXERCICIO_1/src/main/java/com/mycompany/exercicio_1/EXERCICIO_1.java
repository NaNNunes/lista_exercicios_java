/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_1;

/**
 *
 * @author r.nunes
 */
import java.util.Scanner;
public class EXERCICIO_1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float grades[] = new float[3];
        float sumGrades = 0;
        float avarage;
        String result;
        
        for (int i = 0; i < 3; i++){
            System.out.printf("Write the grade of the %d subject:", i+1);
            grades[i] = read.nextFloat();
            sumGrades += grades[i];
        }
        
        avarage = sumGrades/ grades.length; 
        if (avarage >= 7){
            result = "Approved";
        }
        else if (avarage >= 5){
            result = "Recovery";
        }
        else {
            result = "Reproved";           
        }
        
    }
}
