import java.util.Scanner;

public class workHard {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.println("Enter number or end: ");
            String input = scan.nextLine();
            if ("end".equals(input)) {
                System.out.println("sum of numbers: " + sum);
                break;
            }
            int x = Integer.parseInt(input);
            sum += x;
        }
    }           // бесконечный калькулятор суммы чмсел.
}
