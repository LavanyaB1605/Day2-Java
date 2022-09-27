import java.sql.SQLOutput;
import java.util.Scanner;

public class numbernames {
    public static void main(String[]args) {
        System.out.println("Enter Single Digit Number:");
        Scanner obj1 = new Scanner(System.in);
        int number = obj1.nextInt();
        if(number==0)
            System.out.println("Number in word is: Zero");
        else if(number==1)
            System.out.println("Number in word is: One");
        else if(number==2)
            System.out.println("Number in word is: Two");
        else if(number==3)
            System.out.println("Number in word is: Three");
        else if(number==4)
            System.out.println("Number in word is: Four");
        else if(number==5)
            System.out.println("Number in word is: Five");
        else if(number==6)
            System.out.println("Number in word is: Six");
        else if(number==7)
            System.out.println("Number in word is: Seven");
        else if(number==8)
            System.out.println("Number in word is: Eight");
        else if(number==9)
            System.out.println("Number in word is: Nine");
        else
            System.out.println("Please enter single digit value");
    }
}
