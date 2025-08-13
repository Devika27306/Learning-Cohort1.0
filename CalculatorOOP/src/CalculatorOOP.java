import java.util.Scanner;

class CalculatorOOP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b;
        char op;

        System.out.print("First number: ");
        a = s.nextDouble();

        System.out.print("Operator (+ - * /): ");
        op = s.next().charAt(0);

        System.out.print("Second number: ");
        b = s.nextDouble();

        if (op == '+') System.out.println(a + b);
        else if (op == '-') System.out.println(a - b);
        else if (op == '*') System.out.println(a * b);
        else if (op == '/') System.out.println(b != 0 ? a / b : "Error: divide by zero");
        else System.out.println("Invalid");

        s.close();
    }
}

