// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class shio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tahun kelahiran: ");
        int tahun = scanner.nextInt();
        int hasilmod = tahun % 12;
        String[] zodiak = {"Monkey","Rooster","Dog","Pig","Rat","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Sheep"};
        System.out.println("Zodiak anda adalah: " + zodiak[hasilmod]);
        scanner.close();
    }
}