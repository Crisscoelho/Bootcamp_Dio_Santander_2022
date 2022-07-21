/*
O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.

Desenvolva um programa que guarde em um vetor nomes de funcionários de uma empresa.  Deve-se permitir que, ao indicar o índice do vetor, seja indicado qual funcionário está armazenado dentro dessa memória */


import java.io.IOException;
import java.util.Scanner;

public class selecaoDeIndiceDoVetor {

    public static void main(String[] args) throws IOException {
        String[] nomes = new String[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++)
        {

            nomes[i] = input.nextLine();
        }

        int pos = input.nextInt();
        System.out.println( nomes[pos] );

    }
}