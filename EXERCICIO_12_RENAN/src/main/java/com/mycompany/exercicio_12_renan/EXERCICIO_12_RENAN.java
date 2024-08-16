/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_12_renan;

/**
 ** @author renan
 * Sistema de Votação: Desenvolva um programa que permita ao usuário votar em 3
    candidatos diferentes. O programa deve utilizar um laço FOR para permitir a votação de
    vários eleitores e, ao final, exibir o total de votos de cada candidato e o vencedor.
 */
import java.util.Scanner;
import java.util.Random;
public class EXERCICIO_12_RENAN {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner read = new Scanner(System.in);

        final int maxCandidate = 3;
        
        int[][] candidate;       // candidate votes   
        int numberCandidates = 0;   // number of candidates     
        
        int peoplesVote;            // people's vote
        int chosenCandidate;        // chosen candidate
        
        int moreVote = 3;
        
        int counter;
        boolean isValid;
        
        // assing candidates number
        while (numberCandidates < 4){
            numberCandidates = rand.nextInt(6);
        }
        candidate = new int[numberCandidates][2]; // candidate votes
        
        // user votes
        for (int i = 1; i <= maxCandidate; i++){
            System.out.printf("%d vote\n", i);
            isValid = false;
            while (isValid == false) {
                counter = 0;
                System.out.printf("Choose a candidate number: ");
                while (counter < numberCandidates){
                    candidate[counter][0] = counter + 1;
                    System.out.printf("[%d] ", candidate[counter][0]);
                    counter ++;
                }
                System.out.println("[0] NULL VOTE");
                chosenCandidate = read.nextInt();
                if (chosenCandidate > 0 && chosenCandidate <= numberCandidates){
                    if (candidate[chosenCandidate - 1][1] == 0){
                        candidate[chosenCandidate - 1][1] ++;
                        isValid = true;
                    }
                    else {
                        System.out.println("- Candidate already selected -");
                    }
                }
                else if (chosenCandidate == 0){
                    isValid = true;
                }
                else{
                    System.out.println("- Invalid number -");
                }
                
            }
        }
        
        // people's vote
        for (int i = 0; i < numberCandidates; i++){
            do {
                peoplesVote = rand.nextInt(10);
            } while (peoplesVote == 0);
            candidate[i][1] += peoplesVote;
            if (moreVote < candidate[i][1]){
                moreVote = candidate[i][1];
            }
            System.out.printf("Candidate %d: %d votes\n", candidate[i][0], candidate[i][1]);
        }
        
        // check draw 
        counter = 0;
        for (int i = 0; i < numberCandidates; i++){
            if (moreVote == candidate[i][1]){
                counter ++;
            }
        }
        
        switch (counter){
            case 1:
                for (int i = 0; i < numberCandidates; i++){
                    if (moreVote == candidate[i][1]){
                        System.out.printf("--- The winner is number %d with %d votes. ---", candidate[i][0], candidate[i][1]);
                    }
                }
                break;
            default:
                System.out.println("Houve um empate\n prepare-se para votar novamente.");
                break;
        }   
            
    }
}
//m'i dummy or lazy?