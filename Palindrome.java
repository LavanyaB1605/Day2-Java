import java.util.Scanner;

//Program to find Palindrome Number
public class Palindrome {
    public static void main(String[]args) {
        int number, x, y, reminder;
        System.out.println("Enter Number:");
        Scanner obj1 = new Scanner(System.in);
        number = obj1.nextInt();
        x = number;
        for (y = 0; number > 0; number /= 10) {
            reminder = number % 10;
            y = (y * 10) + reminder;
        }
        if(y==x)
            System.out.println("Entered Number is Palindrome");
        else
            System.out.println("Entered Number is not Palindrome");
    }
}
