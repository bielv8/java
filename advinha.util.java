import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int num = rand.nextInt(100) + 1;
        int guess;
        int tries = 0;

        System.out.println("Adivinhe o número entre 1 e 100:");
        do {
            guess = sc.nextInt();
            tries++;

            if (guess > num) {
                System.out.println("O número é menor.");
            } else if (guess < num) {
                System.out.println("O número é maior.");
            }
        } while (guess != num);

        System.out.println("Parabéns, você adivinhou o número em " + tries + " tentativas!");
    }
}
