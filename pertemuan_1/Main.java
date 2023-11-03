import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
//        Scanner input = new Scanner(System.in);
//        String nama = input.nextLine();
//        String NIM = input.nextLine();
        String nama = "Pascal Hadiyanto";
        String NIM = "235150400111045";
        //Jangan ubah kode diatas
        //Tambahkan kode kalian dibawah ini
        String batas = new String(new char[33]).replace("\0", "-");
        //String batas = "---------------------------------";
        System.out.print(batas + "\n");
        System.out.print("|Nama\t: "+nama+"\t|\n");
        System.out.print("|NIM\t: "+NIM+"\t|\n");
        System.out.print(batas + "\n");
        System.out.print(batas + "\n");
        System.out.print("|Nama\t: \'"+nama+"\'\t|\n");
        System.out.print("|NIM\t: \'"+NIM+"\'\t|\n");
        System.out.print(batas + "\n");
        System.out.print(batas + "\n");
        System.out.print("|Nama\t: \""+nama+"\"\t|\n");
        System.out.print("|NIM\t: \""+NIM+"\"\t|\n");
        System.out.print(batas + "\n");
    }
}