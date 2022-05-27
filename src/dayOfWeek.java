import java.util.Scanner;

public class dayOfWeek {

    public int dayofWeek(int d, int y, int m) {

        int y0 = y - (14-m)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14-m)/12)-2;
        int d0 = (d + x + 31 * m0 /12)% 7;
        return d0;
    }

    public static void main(String[] args) {

        // TODO auto generated method stub
        // Initializing variable
        int jan = 0;
        int d, d0 = 0;
        int m;
        int y;

        // Taking input using scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day : ");
        d = sc.nextInt();
        System.out.println("Enter Month : ");
        m = sc.nextInt();
        System.out.println("Enter Year : ");
        y = sc.nextInt();

        // Create object to call function
        dayOfWeek DWeek = new dayOfWeek();
        d0 = DWeek.dayofWeek(d, y, m);

        switch (d0) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
        sc.close();
    }

}