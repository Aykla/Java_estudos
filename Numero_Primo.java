//Title: Verificação de números primos.- JAVA
//By: Rafael Bispo;
//Mod:

import java.util.Scanner;
public class Numero_Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = 379;
        int cont = 0;
        int i = 1;


        // Um número é primo quando ele é divisível somente por 1 e ele mesmo.
        // Possibilidade 1: Contador de divisores entre 2 e o número. Se cont !=1; este número não é primo.

        while (i <= num)
        {
            if (num % i == 0) {
                cont++;
            }
            i++;
        }
        if (cont == 2)
        {
            System.out.println("É primo");
        }
        else
        {
            System.out.println("Não é primo");
        }
        System.out.println(cont);
    }
}