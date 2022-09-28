import java.util.Scanner;

public class MinMax {
    public static void main(String[]args) {
        System.out.println("Enter Two Numbers:");
        Scanner obj1 = new Scanner(System.in);
        System.out.println("a -->");
        int a = obj1.nextInt();
        System.out.println("b -->");
        int b = obj1.nextInt();
        int c = 7;
        int l = a+b*c;
        int m = c+a/b;
        int n = a%b+c;
        int o = a*b+c;
        System.out.println(" ");
        if(l>m && l>n && l>o) {
            System.out.println("Maximum Value is" +l);
        }
        if(m>l && m>n && m>o) {
            System.out.println("Maximum Value is" +m);
        }
        if(n>l && n>m && n>o) {
            System.out.println("Maximum Value is" +n);
        }
        if(o>l && o>m && o>n) {
            System.out.println("Maximum Value is" +o);
        }
        if(l<m && l<n && l<o) {
            System.out.println("Minimum value is" +l);
        }
        if(m<l && m<n && m<o) {
            System.out.println("Minimum value is" +m);
        }
        if(n<l && n<m && n<o) {
            System.out.println("Minimum value is" +n);
        }
        if(o<l && o<m && o<n) {
            System.out.println("Minimum value is" +o);
        }

    }

}
