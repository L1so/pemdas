// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class kecepatan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kecepatan awal: ");
        double awal = scanner.nextDouble();

        System.out.print("Masukkan kecepatan akhir: ");
        double akhir = scanner.nextDouble();

        double waktuSekarang = 0;
        double waktuKuliah = 600;
        double jarak = 4500;

        double waktuTempuh = (2 * jarak) / (awal + akhir);

        if (waktuTempuh > waktuKuliah) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
