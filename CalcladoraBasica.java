//Title: Calculadora básica com seletor de operação
//By: Rafael Bispo;
//Mod:

import java.util.Scanner;
public class CalcladoraBasica {
    public static void main(String[]args) {
        int x, y, r;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione a operação: \n(+); (-); (*); (/)");
        op = sc.nextLine();
        if (op.equals("+")) {
            System.out.println("Digite um número:");
            x = sc.nextInt();
            System.out.println("Digite outro número:");
            y = sc.nextInt();
            System.out.println("O resultado é:\n"+ (x+y) );
            return;
        }
        if (op.equals("-")) {
            System.out.println("Digite um número:");
            x = sc.nextInt();
            System.out.println("Digite outro número:");
            y = sc.nextInt();
            System.out.println("O resultado é:\n"+ (x-y) );
            return;
        }
        if (op.equals("*")) {
            System.out.println("Digite um número:");
            x = sc.nextInt();
            System.out.println("Digite outro número:");
            y = sc.nextInt();
            System.out.println("O resultado é:\n"+ (x*y) );
            return;
        }
        if (op.equals("/")) {
            System.out.println("Digite um número:");
            x = sc.nextInt();
            System.out.println("Digite outro número:");
            y = sc.nextInt();
            System.out.println("O resultado é:\n"+ (x/y) );
            return;
        }
        else
        {
            System.out.println("operação inválida!");
        }
    }
}
