import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2;
        String operator;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();
        System.out.print("Digite o operador (+, -, *, /): ");
        operator = sc.next();

        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Operador inválido.");
                break;
        }
    }
}
