import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String str = scanner.nextLine();
        String nstr = "";
        char ch;
        if (str.length() >= 4) {
            System.out.println(str);
        } else {
            for (int i = 0; i<str.length(); i++) {
                ch = str.charAt(i);
                nstr = ch+nstr;
            }
            System.out.println(nstr);
        }
        scanner.close();
    }
}