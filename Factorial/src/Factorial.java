import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " = " + factorial(num));

        sc.close();
    }

    public static long factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }
}
