import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputnya = scanner.nextLine();
        if (inputnya.length() > 50 ) {
            String input1 = inputnya.replaceAll("yang", "yg");
            String input2 = input1.replaceAll("enggak", "g");
            String input3 = input2.replaceAll("bisa", "bs");
            String input4 = input3.replaceAll("enggak bisa", "gb");
            System.out.println(input4);
        } else {
            System.out.println(inputnya);
        }
        scanner.close();
    }
}
