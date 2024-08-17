/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios_18_renan;

/**
 ** @author renan
 * Sistema de Pedágio: Desenvolva um programa que simule a cobrança de pedágio em
    uma estrada. O usuário deve inserir o tipo de veículo (carro, moto, caminhão) e o programa
    deve utilizar IF-ELSE para calcular o valor do pedágio com base em uma tabela de preços
    predefinida.
 */

import java.util.Scanner;
import java.util.Random;
public class EXERCICIOS_18_RENAN {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random rand = new Random();
        
        float value;
        int categ;
        
        float baseFare;
        float tariff = 0;
        
        do {
            baseFare = rand.nextInt(11);
        } while (baseFare < 6);
        
        System.out.println("Choose category [1]A [2]B [3]C");
        categ = read.nextInt();
        
        if (categ == 1){
            tariff = (baseFare * 2) + (baseFare * 8/100);
        } 
        else if (categ == 2){
            tariff = (baseFare * 3) + (baseFare * 8/100);
        }
        else if (categ == 3){
            tariff = (baseFare * baseFare) + (baseFare * 25/100);
        }    
        System.out.printf("Fee: R$ %.2f\n", baseFare);
        System.out.printf("Toll Fee: R$ %.2f", tariff);
    }
}
