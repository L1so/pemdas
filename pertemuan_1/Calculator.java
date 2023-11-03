import java.io.*;
import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = input.nextDouble();

        while (true) {
            int angka = 0;
            String symbol = input.next();

            if (symbol.equals("=")) {
                System.out.println(String.format("%.0f", result));
                break;
            }

            switch (symbol) {
                case "+":
                case "-":
                case "x":
                case "/":
                    break;
                default:
                    System.out.println("Masukkan operator + , - , x , atau /");
                    System.exit(0);
                    break;
            }
            angka = input.nextInt();
            switch (symbol) {
                case "+":
                    result += angka;
                    break; // Add break statement
                case "-":
                    result -= angka;
                    break; // Add break statement
                case "x":
                    result *= angka;
                    break; // Add break statement
                case "/":
                    if (angka == 0) {
                        System.out.println("Pembagian oleh 0 tidak diizinkan.");
                        System.exit(0);
                    }
                    result /= angka;
                    break; // Add break statement
            }
        }
    }
}