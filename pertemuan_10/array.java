import java.util.Scanner;

public class array {
    public static void main(String[] args) {
    	String nama_1 = "Ujang";
    	String nim_1 = "56";
    	String nama_2 = "Ajeng";
    	String nim_2 = "85";
    	String nama_3 = "Agus";
    	String nim_3 = "34";
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Data mahasiswa yang dicari: ");
    	int nim_yang_dicari = scanner.nextInt();
        String[][] nama_dan_nim = { {nama_1, nama_2, nama_3}, {nim_1, nim_2, nim_3} };
/*        System.out.println(nama_dan_nim[0][0]);*/

System.out.println("Daftar Mahasiswa: ");

for (int i = 0; i < nama_dan_nim[0].length; i++) {
    if (nim_yang_dicari == Integer.parseInt(nama_dan_nim[1][i])) {
    	System.out.println(nama_dan_nim[0][i] + "\t\t" + nama_dan_nim[1][i]);
    }
}
    }
}