import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, rev = 0;
        System.out.println("Enter number to find Reverse : ");
        num = sc.nextInt();

        while (num > 0)
        {
            rev = (rev * 10) + num % 10;
            num = num/10;
        }
        System.out.println("Reverse : " + rev);
    }

}
