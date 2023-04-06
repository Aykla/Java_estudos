//Title: Numero de caracteres, consoantes e vogais.- JAVA
//By: Rafael Bispo;
//Mod:

import java.util.Scanner;

public class Numero_de_caracteres {
    public static void main(String[] args) {
        String frase;
        int i = 0; // contador de loop
        int vog = 0; // contador de vogais
        int cons = 0; // contador de consoantes
        int esp = 0; // contador de espaçoes
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        frase = sc.nextLine();
        while (i < frase.length()) // loop que percorre a frase
        {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u' || frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U') { // se a letra atual é uma vogal, incrementa o contador de vogais
                vog++;
            } else {
                if (frase.charAt(i) == ' ') // se a letra atual é um espaço em branco, incrementa o contador de espaços
                {
                    esp++;
                } else // se não é vogal nem espaço, é uma consoante, então incrementa o contador de consoantes
                {
                    cons++;
                }
            }
            i++; // passa para a próxima letra da frase
        }
        if (esp != 0) // se houve pelo menos um espaço em branco, imprime a frase e o número de vogais, consoantes e espaços
        {
            System.out.println("A frase tem " + (frase.length() - esp) + " caracteres.\nVogais: " + vog + "\nConsoantes: " + cons + "\nEspaços: " + esp);
        } else // se não houve espaços em branco, imprime a frase e o número de vogais e consoantes
        {
            System.out.println("A frase tem " + (frase.length()) + " caracteres.\nVogais: " + vog + "\nConsoantes: " + cons);
        }
    }
}