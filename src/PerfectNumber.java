import java.util.Scanner;

public class PerfectNumber
{
    public static void main(String[] args)
    {
        int number, sum =0;
        System.out.println("Enter any Number : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        for(int i = 1; i < number; i++)
        {
            if(number%i == 0)
            {
                sum = sum + i;
            }
        }
        if(number == sum)
            System.out.print("Perfect Number");
        else
            System.out.println("Not Perfect Number");
    }
}
