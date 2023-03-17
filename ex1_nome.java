package br.eti.test.estudos.java;

import java.util.Scanner;

public class ex1_nome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        while (true) {
            System.out.println("Digite seu nome:");
            nome = scan.next();
            if(nome.equals("0")) break;
                
            System.out.println("Digite sua idade:");
            idade = scan.nextInt();
                    
            
        }
         System.out.println("Continue");
        
        
        
    }
   
    
}
