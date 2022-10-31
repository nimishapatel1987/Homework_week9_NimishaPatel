package homework_week_9;
//programme that tell you which line pass through particular stations
//just use Zone 1 stations name

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        Programme10 obj = new Programme10();
        obj.oxfordCircus();
    }

    public void oxfordCircus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter line name ");
        String input = scanner.next();
        switch (input) {
            case "jubilee":
            case "Baker Street":
            case "bakerloo":
            case "Kings cross":
            case "Liverpool Street":
                System.out.println("Line pass through Oxford Circus");
                break;

            default:
                System.out.println("Line not passing from Oxford Circus");
                scanner.close();
        }
    }
}
