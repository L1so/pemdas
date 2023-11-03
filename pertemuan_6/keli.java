import java.util.Scanner;

public class keli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bangun: ");
        String bangun_datar = scanner.nextLine();

        System.out.print("Panjang: ");
        double panjang = scanner.nextDouble();

        double luas = 0.0;
        double keliling = 0.0;

        if (bangun_datar.equals("circle")) {
            // Lingkaran
            luas = Math.PI * panjang * panjang;
            keliling = 2.0 * Math.PI * panjang;
        } else if (bangun_datar.equals("square")) {
            // Persegi
            luas = panjang * panjang;
            keliling = 4.0 * panjang;
        } else {
            // Persegi Panjang
            System.out.print("Lebar: ");
            double lebar = scanner.nextDouble();
            luas = panjang * lebar;
            keliling = 2.0 * (panjang + lebar);
        }

        System.out.println("The Plane Figure Type: " + bangun_datar);
        System.out.println("Area : " + String.format("%.2f", luas));
        System.out.println("Perimeter : " + String.format("%.2f", keliling));

        scanner.close();
    }
}
