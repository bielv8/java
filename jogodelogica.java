import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int num1 = rand.nextInt(10) + 1;
        int num2 = rand.nextInt(10) + 1;
        int answer;

        System.out.println("Quantos é " + num1 + " + " + num2 + "?");
        answer = sc.nextInt();

        if (answer == num1 + num2) {
            System.out.println("Correto!");
        } else {
            System.out.println("Incorreto. A resposta correta é " + (num1 + num2) + ".");
        }
    }
}
