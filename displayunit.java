import java.util.Scanner;

public class displayunit {
    public static void main(String[]args) {
        System.out.printf("Enter Three Digit Number:");
        Scanner obj1 = new Scanner(System.in);
        int hundred = 0;
        int tens = 0;
        int ones = 0;
        int number = obj1.nextInt();
        if(number <= 999 && number > 99) {
            hundred = number/100;
            System.out.printf("\n Hundreds place is:" +hundred);
            tens = (number - (hundred * 100)) / 10;
            System.out.printf("\n Tens place is:" +tens);
            ones = (number -(tens * 10) - (hundred *100));
            System.out.printf("\n Ones place is:" +ones);
        }
        else {
            System.out.printf("\n Please enter only three digit number");
        }
    }
}
