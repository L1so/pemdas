import java.io.*;
import java.util.*;

public class iya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine().toUpperCase();
        String  Bruno;
        String Trish;
        String Mista;
        double harga = input.nextDouble();
        double lamaMenginap = input.nextDouble();
        System.out.println("Nama: "+ nama);
        System.out.println("Lama penginapan: " + (int)lamaMenginap);
        System.out.println("Harga permalam: "+ (int)harga);
        if(nama.equalsIgnoreCase("BRUNO")){
            System.out.println("Diskon : 80%");
            double hargaBruno = harga * (100 - 80) / 100;
            double dis = 80;
            if (lamaMenginap<=5){
                double hargaTotal = hargaBruno*lamaMenginap;
                System.out.print("Biaya total: ");
                System.out.printf("%.2f\n", hargaTotal);
            }else{
                double hargaTotal = hargaBruno * 5 + ((lamaMenginap - 5) * 0.5 * hargaBruno);
                System.out.print("Biaya total: ");
                System.out.printf("%.2f\n", hargaTotal);
            }
        }else if (nama.equalsIgnoreCase("TRISH")){
            System.out.println("Diskon : 70%");
            double dis = 70;
            double hargaTrish = harga * (100 - 70) / 100;
            if (lamaMenginap<=5){
                double hargaTotal = hargaTrish*lamaMenginap;
                System.out.print("Biaya total: ");
                System.out.printf("%.2f\n", hargaTotal);
                // System.out.print("Biaya total: "+ hargaTotal);
            }else{
                double hargaTotal = hargaTrish * 5 + ((lamaMenginap - 5) * 0.5 * hargaTrish);
                System.out.print("Biaya total: ");
                System.out.printf("%.2f\n", hargaTotal);
                // System.out.print("Biaya total: "+ hargaTotal);
            }
        }else if (nama.equalsIgnoreCase("MISTA")){
            System.out.println("Diskon : 60%");
            double dis = 60;
            double hargaMista = harga * (100 - 60) / 100;
            if (lamaMenginap<=5){
                double hargaTotal = hargaMista*lamaMenginap;
                System.out.print("Biaya total: ");
                System.out.printf("%.2f\n", hargaTotal);
                // System.out.print("Biaya total: "+ hargaTotal);
            }else{
                double hargaTotal = hargaMista * 5 + ((lamaMenginap - 5) * 0.5 * hargaMista);
                System.out.print("Biaya total: ");
                System.out.printf("%.2f\n", hargaTotal);
                // System.out.print("Biaya total: "+ hargaTotal);
            }
        }else{
            System.out.println("Tidak ada diskon");
            if (lamaMenginap <= 5) {
                double hargaTotal = harga * lamaMenginap;
                System.out.print("Biaya total: ");
                System.out.printf("%.2f\n", hargaTotal);
                // System.out.print("Biaya total: " + hargaTotal);
            } else {
                double hargaTotal = harga * 5 + ((lamaMenginap - 5) * 0.5 * harga);
                // System.out.print("Biaya total: " + hargaTotal);
                System.out.print("Biaya total: ");
                System.out.printf("%.2f\n", hargaTotal);
            }
        }
    }
}