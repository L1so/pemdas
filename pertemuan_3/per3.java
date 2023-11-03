// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class per3 {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String nama = "Susi Hidayat";
        String tgl = "08-05-1998";
        double currency = 1887.99;
        String fs = "Data Scientist";
        String batas = new String(new char[39]).replace("\0", "-");
        System.out.print(batas + "\n");
        System.out.printf("|%-15s%2s%-20s%s\n", "Nama", ":", nama, "|");
        System.out.printf("|%-15s%2s%-20s%s\n", "Tanggal Lahir", ":", tgl, "|");
        System.out.printf("|%-15s%2s%-20s%s\n", "Pengeluaran", ":", currency, "|");
        System.out.printf("|%-15s%2s%-20s%s\n", "Pekerjaan", ":", fs, "|");
        System.out.print(batas + "\n");
//        double tambah = n1 + n2;
//        double kurang = n1 - n2;
//        double bagi = n1 / n2;
//        double kali = n1 * n2;
        //System.out.printf("%.2s", tambah);
//        System.out.printf("%-15s %2s +%.2f\n", "TAMBAH", ":", tambah);
//        System.out.printf("%-15s %2s %.2f\n", "KURANG", ":", kurang);
//        System.out.printf("%-15s %2s +%.2f\n", "BAGI", ":", bagi);
//        System.out.printf("%-15s %2s +%.2f\n", "KALI", ":", kali);

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.printf("i = " + i);
//        }
    }
}