package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        char symbol, ch = 'Y';
        Scanner scanner = new Scanner(System.in);
        while (ch == 'Y') {
            System.out.println("Enter first number: ");
            a = scanner.nextInt();
            System.out.println("Enter second number: ");
            b = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*,/ : ");
            symbol = scanner.next().charAt(0);

            Calculator obj = new Calculator();
            obj.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation, Please enter 'Y' or 'N': ");
            ch = scanner.next().charAt(0);
            scanner.close();
        }
    }

}
