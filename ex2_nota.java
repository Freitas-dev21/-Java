/*
Faça um programa que peça uma nota , entre zero e dez.
Mostre uma mensagem caso o valor seja invalido e continue pedindo ate 
que o usuário informe um valor valido. 

*/
package br.eti.test.estudos.java;

import java.util.Scanner;

public class ex2_nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Digite uma nota: ");
        nota =  scan.nextInt();
        
        while(nota < 0 | nota > 10){
            System.out.println("Digite novamente  ");
            nota = scan.nextInt();
        }
        
    }
    
}