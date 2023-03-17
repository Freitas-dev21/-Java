/*
 * Faça um programa que leia 5
numeros e informe o maior numero e a media desses numeros
 */
package br.eti.test.estudos.java;
import java.util.Scanner;
public class exe3_maiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero,contador = 0,maior = 0,soma = 0;
        do {            
            System.out.println("Você deverar digitar 5x um valor ");
            numero = scan.nextInt();
            soma = soma + numero;
            if(numero > maior) maior = numero;
            contador = contador + 1; //contador++
        } while (contador < 5);
        
        System.out.println("maior: "+ maior);
        System.out.println("Media: "+(soma/5));
        
    }
    
}
