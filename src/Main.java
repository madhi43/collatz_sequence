import java.util.Scanner;

public class Main {
    public static void printCollatzSequence(int n) {
        while (n > 1) {
            System.out.print(n + " ");
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printCollatzSequence(scanner.nextInt());
        scanner.close();
    }
}
