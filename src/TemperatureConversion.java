import java.util.Scanner;

class TemperatureConversion {

    public static void main(String[] args) {

        double tempF, tempC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type of Conversion \n 1.Fahrenheit to Celsius \n 2.Celsius to Fahrenheit");
        int ch = sc.nextInt();

        switch (ch)
        {
            case 1:
                System.out.println("Enter Fahrenheit temperature : ");
                tempF = sc.nextDouble();
                tempC = (tempF - 32)* 5/9;
                System.out.println("Celsius temperature is " + tempC);
                break;
            case 2:
                System.out.println("Enter Celsius temperature : ");
                tempC = sc.nextDouble();
                tempF = ((9 * tempC)/5) + 32;
                break;
            default:
                System.out.println("Please choose valid choice");

        }

    }
}