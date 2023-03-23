package br.eti.test.estudos.java;

import java.util.Scanner;

public class ex4_ParImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantNumeros, numero, quantPares = 0, quantImpar = 0, contador = 0;
        System.out.println("Digite o valor");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                quantPares++;
            } else {
                quantImpar++;
            }
            contador++;

        } while (contador < quantNumeros);
        System.out.println("Quantidade IMPAR :" + quantImpar);
        System.out.println("Quantidade PAR :" + quantPares);

    }

}
