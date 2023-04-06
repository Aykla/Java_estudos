//Title: Ordenador de números;
//By: Rafael Bispo;
//Mod: Implementar array;
import java.util.Scanner;
public class ordenador_de_numeros {
    public static void main(String[] args) {

        String frase; // Variável utilizada para identificar se o usuário deseja continuar a operação ou parar. (L57)
        int x, y, z; // Variáveis para representação de cada entrada numérica. Podem ser substituídos por um array de 3 casas.
        boolean ver = true; // Constante para o programa continuar executando mesmo após erro.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma sequência de 3 números:");
        while (ver) {

            if (sc.hasNextInt()) {
                x = sc.nextInt();
                y = sc.nextInt();
                z = sc.nextInt();
                // casos em que X está à frente de Y;
                if (x > y) {
                    if (x > z) {
                        if (z > y) {
                            String resp = String.format("A sequência é: %d, %d, %d.", x, z, y);
                            System.out.println(resp);
                        } else {
                            String resp = String.format("A sequência é: %d, %d, %d.", x, y, z);
                            System.out.println(resp);
                        }
                    } else {
                        String resp = String.format("A sequência é: %d, %d, %d.", z, x, y);
                        System.out.println(resp);
                    }
                    //Casos em que Y está à frente de Z.
                } else if (y > z) {
                    if (z > x) {
                        String resp = String.format("A sequência é: %d, %d, %d.", y, z, x);
                        System.out.println(resp);
                    } else {
                        String resp = String.format("A sequência é: %d, %d, %d.", y, x, z);
                        System.out.println(resp);
                    }
                    // Casos em que Z está a frente de X.
                } else if (z > x) {
                    if (z > y) {
                        if (y > x) {
                            String resp = String.format("A sequência é: %d, %d, %d.", z, y, x);
                            System.out.println(resp);
                        }
                    }
                }
            }
            else {
                System.out.println("Caractere inválido! Digite \n\"exit\" para sair\n\"continuar\" para tentar novamente.");
                sc.nextLine();
                frase = sc.nextLine();
                    if (frase.equals("exit"))
                    {
                    System.out.println("Programa finalizado!");
                    return;
                    }
                    else
                    {
                    System.out.println("Digite uma sequência de 3 números:");
                    }
            }
        }
    }
}