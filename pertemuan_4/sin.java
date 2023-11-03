import java.util.Scanner;

public class sin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jarak dari dasar gedung: ");
        int jarak_b_ke_c = scanner.nextInt();

        System.out.print("Sudut elevasi: ");
        int sudut_cbs = scanner.nextInt();
        Double sudut_cba = Math.toRadians(sudut_cbs);

        //double jarak_sisi_miring = jarak_b_ke_c / Math.cos(sudut_cba);
        double tinggi_gedung = Math.ceil(jarak_b_ke_c * Math.tan(sudut_cba));
        double jarak_sisi_miring = Math.floor(Math.sqrt(tinggi_gedung*tinggi_gedung+jarak_b_ke_c*jarak_b_ke_c));
        //int jarakmiring = jarak_sisi_miring.intValue();
        int jarakmiring = (int)jarak_sisi_miring;
        int tinggi_gedungs = (int)tinggi_gedung;

        System.out.println("Tinggi gedung: " + tinggi_gedungs);
        System.out.println("Jarak kamera dengan Blisk: " + jarakmiring);

        boolean apakah = jarakmiring < 1000;
        System.out.println("Apakah Blisk terdeteksi? " + apakah);
    }
}
