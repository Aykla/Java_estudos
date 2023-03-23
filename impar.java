import java.util.Scanner;

public class impar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Digite um número:");
        a = sc.nextInt();
        System.out.println("Digite um número maior:");
        b = sc.nextInt();

        if (a < b)
        {
            while (a <= b)
            {
                if (a % 2 != 0)
                        System.out.print(a);
                if (a % 2 == 0)
                {
                        System.out.print(" ");
                } else
                    if ((a==b) || (a==(b-1)))
                        System.out.print(".");
                    else
                        System.out.print(",");
                a++;
            }
        }
        else System.out.print("Invalid operation!");
    }
}
