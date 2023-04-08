//Title: verificar o maior e menor números da sequencia (sem array).- JAVA
//By: Rafael Bispo;
//Mod:

import java.util.Scanner;

public class maior_e_menor {
    public static void main(String[] args) {
        int a, b, c, d, e;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 5 números:");
        System.out.print("=>");
        a = sc.nextInt();
        System.out.print("=>");
        b = sc.nextInt();
        System.out.print("=>");
        c = sc.nextInt();
        System.out.print("=>");
        d = sc.nextInt();
        System.out.print("=>");
        e = sc.nextInt();

        //verificar qual é o maior número;
        if (a > b && a > c && a > d && a > e) {
            System.out.print(a + " é o maior e ");
        }
        if (b > a && b > c && b > d && b > e) {
            System.out.print(b + " é o maior e ");
        }
        if (c > a && a > b && c > d && c > e) {
            System.out.print(c + " é o maior e ");
        }
        if (d > a && d > b && d > c && d > e) {
            System.out.print(d + " é o maior e ");
        }
        if (e > a && e > b && e > c && e > d) {
            System.out.print(e + " é o maior e ");
        }


        //Verificar qual é o menor número;
        if (a < b && a < c && a < d && a < e) {
            System.out.println(a + " é o menor.");
        }
        if (b < a && b < c && b < d && b < e) {
            System.out.println(b + " é o menor.");
        }
        if (c < a && c < b && c < d && c < e) {
            System.out.println(c + " é o menor.");
        }
        if (d < a && d < b && d < c && a < e) {
            System.out.println(d + " é o menor.");
        }
        if (e < a && e < b && e < c && e < d) {
            System.out.println(e + " é o menor.");
        }
    }
}
