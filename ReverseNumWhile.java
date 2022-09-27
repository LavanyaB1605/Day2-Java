import java.util.Scanner;

//Program to reverse the integer number
public class ReverseNumWhile {
    public static void main(String[]args) {
        int number, reverse=0;
        System.out.println("Enter Number:");
        Scanner obj1 = new Scanner(System.in);
         number = obj1.nextInt();
        while(number!=0) {
            int n = number%10;
            reverse = reverse*10+n;
            number = number/10;
        }
        System.out.println("Reverse of Entered Number is:" +reverse);
    }
}
