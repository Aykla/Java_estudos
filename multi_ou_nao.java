//Title: Verificar múltiplos ou não.- JAVA
//By: Rafael Bispo;
//Mod:

import java.util.Scanner;

public class multi_ou_nao {
    public static void main(String[]args) {
        int x, y, r= 0, i= 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite dois números: \n=> ");
        x = sc.nextInt();
        System.out.print("=> ");y = sc.nextInt();

        if (x<=y)
        {
            while (i<=y)
            {
                r = x * i;
                if (r == y) {
                    System.out.println(x + " e " + y + " são multiplos.");
                    return;
                } else {
                    i++;
                }
            }
            if (r != y)
            {
                System.out.println(x + " e " + y + " não são multiplos.");
            }
        }
        else
        {
            while (i<=x)
            {
                r = y * i;
                if (r == x) {
                    System.out.println(y + " e " + x + " são multiplos.");
                    return;
                } else {
                    i++;
                }
            }
            if (r != x)
            {
                System.out.println(y + " e " + x + " não são multiplos.");
            }
        }
    }
}
