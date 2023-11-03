import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sudut_in = scanner.nextInt();
        int kec_in = scanner.nextInt();
        double sudut = Math.toRadians(sudut_in);
        double kec = kec_in * 1000 * 6 / 3600;
        double jarak_horizontal = Math.tan(sudut) * 50;
        int jarak_horizontals = (int) Math.ceil(jarak_horizontal);
        if (kec > jarak_horizontal) {
            System.out.println("Jarak horizontal bola terhadap gedung: " + jarak_horizontals + " meter" );
            System.out.println("Peserta dapat menangkap bola: true");
        }
        else {
            System.out.println("Jarak horizontal bola terhadap gedung: " + jarak_horizontals + " meter" );
            System.out.println("Peserta dapat menangkap bola: false");
        }
    }
}