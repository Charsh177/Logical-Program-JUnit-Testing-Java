import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 1;
        int z = 0;
        System.out.println("Enter max value : ");
        int n = sc.nextInt();

        while (z <= n) {
            System.out.println(z);
            x = y;
            y = z;
            z = x + y;
        }
    }
}