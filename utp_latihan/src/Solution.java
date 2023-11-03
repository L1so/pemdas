import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tamuAwal = scanner.nextLine();
        double hargaAwal = scanner.nextDouble();
        int lama = scanner.nextInt();
        String tamu = tamuAwal.toUpperCase();
        int diskon;
        switch (tamu) {
            case "BRUNO":
                diskon = 80;
                break;
            case "TRISH":
                diskon = 70;
                break;
            case "MISTA":
                diskon = 60;
                break;
            default:
                diskon = 0;
                break;
        }

        double harga = hargaAwal * (100 - diskon) / 100;
        double hargaTotal;

        if (lama > 5) {
            double sisaHari = lama - 5;
            double hargaNormal = harga * 5;
            double hargaSisa = (harga * 0.5 * sisaHari);
            hargaTotal = hargaNormal + hargaSisa;
        } else {
            hargaTotal = harga * lama;
        }

        String diskonString = (diskon == 0) ? "Tidak ada diskon" : "Diskon : " + diskon + "%";
        String HargaTotal = String.format("%.2f", hargaTotal);
        System.out.println("Nama: " + tamu);
        System.out.println("Lama penginapan: " + lama);
        System.out.println("Harga permalam: " + String.format("%.0f", hargaAwal));
        System.out.println(diskonString);
        System.out.println("Biaya total: " + HargaTotal);
    }
}
