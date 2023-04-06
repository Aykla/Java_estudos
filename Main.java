//Title: Identificação de palíndromos
//By: Rafael Bispo;
//Mod:

import java.util.Scanner;
public class Main {
    public static void main(String[]args) {

        String nome;
        int i = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase:");
        nome = sc.nextLine();
        nome = nome.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int ii = nome.length()-1;
        while (i< nome.length() && ii>=i)
        {
            if (nome.charAt(i) == nome.charAt(ii))
            {
                i++;
                ii--;
            }
            else
            {
                System.out.println("Não é um palíndromo!");
                return;
            }
        }
        System.out.println("É um palíndromo!");
    }
}