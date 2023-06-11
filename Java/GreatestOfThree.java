import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if (a > b && a > c) {
                System.out.println(a + " is the greatest number");
            } else if (b > a && b > c) {
                System.out.println(b + " is the greatest number");
            }else if (c > a && c > b) {
                System.out.println(c + " is the greatest number");
            } else {
                System.out.println("all numbers are equal");
            }
        }
    }
}