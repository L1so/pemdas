import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis_kendaraan = input.nextInt();
        int jam = input.nextInt();
        int bayar_berapa = input.nextInt();

        int biaya = 0;

        switch (jenis_kendaraan){
            case 1:
                biaya = 2000;
                break;
            case 2:
                biaya = 4000;
                break;
            case 3:
                biaya = 9000;
                break;
        }
        int biaya_total = jam * biaya;

        if (bayar_berapa == biaya_total) {
            System.out.println("Uang yang dibayarkan pas.");
        } else if (bayar_berapa < biaya_total) {
            System.out.println("Uang anda belum mencukupi.");
        } else {
            int kembalian = bayar_berapa - biaya_total;
            int uang10k = kembalian / 10000;
            kembalian = kembalian % 10000;
            int uang5k = kembalian / 5000;
            kembalian = kembalian % 5000;
            int uang500 = kembalian / 500;
            kembalian = kembalian % 500;
            int uang100 = kembalian / 100;

            System.out.println("Anda mendapatkan kembalian sebesar:");
            System.out.println(uang10k + " uang 10.000");
            System.out.println(uang5k + " uang 5.000");
            System.out.println(uang500 + " uang 500");
            System.out.println(uang100 + " uang 100");
        }
        }
    }