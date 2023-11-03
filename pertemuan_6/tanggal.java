import java.util.Scanner;

public class tanggal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tgl_expire = scanner.nextLine();
        String tgl_skrg = scanner.nextLine();

        String[] expire = tgl_expire.split("/");
        String[] sekarang = tgl_skrg.split("/");

        int tglnya = Integer.parseInt(expire[0]);
        int bulannya = Integer.parseInt(expire[1]);
        int tahunnya = Integer.parseInt(expire[2]);

        int tglnya_skrg = Integer.parseInt(sekarang[0]);
        int bulannya_skrg = Integer.parseInt(sekarang[1]);
        int tahunnya_skrg = Integer.parseInt(sekarang[2]);

        if (tahunnya > tahunnya_skrg) {
            System.out.println("Aman");
        } else if (tahunnya == tahunnya_skrg) {
            if (bulannya > bulannya_skrg) {
                System.out.println("Aman");
            } else if (bulannya == bulannya_skrg && tglnya > tglnya_skrg) {
                System.out.println("Aman");
            } else {
                System.out.println("Tidak aman");
            }
        } else {
            System.out.println("Tidak aman");
        }
    }
}
