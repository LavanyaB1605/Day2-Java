import java.util.Scanner;

public class sumforloop {
    public static void main(String[]args) {
        System.out.println("Enter Natural Number:");
        Scanner obj1 = new Scanner(System.in);
        int number = obj1.nextInt();
        int sum = 0, i = 1;
        for (i = 1; i <= number; i++)
            sum = sum + i;
        System.out.printf("Sum of given digits are:" + sum);
    }
}
