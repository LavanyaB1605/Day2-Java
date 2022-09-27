import java.util.Scanner;

//Program to reverse the integer number
public class ReverseNumFor {
    public static void main(String[]args) {
        int number, reverse = 0;
        System.out.println("Enter Number:");
        Scanner obj1 = new Scanner(System.in);
        number = obj1.nextInt();
        for(;number!=0;number=number/10) {
            int n = number%10;
            reverse = reverse*10+n;
        }
        System.out.println("Reverse of Entered Digit is: " +reverse);
    }
}
