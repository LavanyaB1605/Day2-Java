import java.sql.SQLOutput;
import java.util.Scanner;
//Write a true or false program for SpringSeason
public class SpringSeason {
    public static void main(String[]args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter day: ");
        int d = obj.nextInt();
        System.out.println("Enter month: ");
        int m = obj.nextInt();
        if(m == 3 && d >=20 && d<=31)
            System.out.println("TRUE");
        else if (m == 4 && d >=1 && d<=31)
            System.out.println("TRUE");
        else if (m == 5 && d >= 1 && d<=31)
            System.out.println("TRUE");
        else if (m == 6 && d >=1 && d<=20)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

        }

    }
