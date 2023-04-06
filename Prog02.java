//Title: Soma básica
//By: Rafael Bispo;
//Mod:
import java.util.Scanner;
    public class Prog02 {
        public static void main(String[]args) {
           int x,y,r;
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número:");
            x = sc.nextInt();
            System.out.println("Digite outro número:");
            y = sc.nextInt();

            /* A representação da soma pode ser de duas formas:
            1. fazendo o calculo e atribuindo o valor do resultado a uma variável e mostrando essa variável (r);
            2. Fazendo o calculo dentro do Sys.out.println através do uso de ().
             */

            r=x+y;
            System.out.println("O resultado é: "+ (x+y)+ "\nMétodo 1\n");
            System.out.printf("O resultado é:"+ r+ "\nMétodo 2\n");

        }
}
