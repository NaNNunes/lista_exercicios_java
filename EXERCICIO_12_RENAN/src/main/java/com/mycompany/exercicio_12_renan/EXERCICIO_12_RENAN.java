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
        int[] vote = null;
        
        int candidateNum = 0;
        
        while (candidateNum < 4){
            candidateNum = rand.nextInt(11);
            vote = new int[candidateNum];
        }
        System.out.printf("%d %d",candidateNum, vote.length);
        
        
    }
}
