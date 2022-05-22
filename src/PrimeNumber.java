import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int number, count = 0;
        System.out.print("Enter any Number : ");
        Scanner ref = new Scanner(System.in);
        number = ref.nextInt();

        for(int i = 1; i <= number; i++)
        {
            if(number%i == 0)
            {
                count++;
            }
        }

        if(count == 2)
            System.out.print("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}
