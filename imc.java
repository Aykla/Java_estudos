//Title: Calculadora de IMC com verificador de caractere (, e .).- JAVA
//By: Rafael Bispo;
//Mod:

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {

        // Declaração das variáveis que serão utilizadas para armazenar o peso e altura
        String peso, altura;
        Scanner sc = new Scanner(System.in); // Instanciação de um objeto Scanner para leitura de dados

        //Entrada de dados
        System.out.print("Digite seu peso: \n=> "); // Solicitação para o usuário digitar o peso
        peso = sc.nextLine(); // Leitura do peso digitado pelo usuário
        System.out.print("Digite sua altura: \n=> "); // Solicitação para o usuário digitar a altura
        altura = sc.nextLine(); // Leitura da altura digitada pelo usuário

        //Verificação se os números estão escritos corretamente;
        if (peso.contains(",")) // Verifica se o número contém vírgula
        {
            peso = peso.replace(",", "."); // Substitui a vírgula por ponto
        }
        if (altura.contains(",")) // Verifica se o número contém vírgula
        {
            altura = altura.replace(",", "."); // Substitui a vírgula por ponto
        }

        // Converte as strings peso e altura em números decimais (double)
        double peso2 = Double.parseDouble(peso);
        double altura2 = Double.parseDouble(altura);

        // Calcula o IMC com base no peso e altura informados pelo usuário
        double imc = peso2 / (altura2 * altura2);

        // Exibe o resultado do IMC com duas casas decimais
        System.out.printf("O seu IMC é de %.2f\n", imc);

        // Verifica a classificação do IMC de acordo com a tabela de referência
        if (imc < 18.5) {
            System.out.println("Você se classifica como \"magreza\".");
        }
        if (imc >= 18 && imc < 25) {
            System.out.println("Você se classifica como \"normal\".");
        }
        if (imc >= 25 && imc < 30) {
            System.out.println("Você se classifica como \"obesidade\" e \"sobrepeso I\".");
        }
        if (imc >= 30 && imc < 40) {
            System.out.println("Você se classifica como \"obesidade\" e \"sobrepeso II\".");
        }
        if (imc >= 40) {
            System.out.println("Você se classifica como \"obesidade\" e \"sobrepeso III\". Procure um médico urgentemente!");
        }
    }
}

