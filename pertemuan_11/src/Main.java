import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input_user = input.nextLine();
        input_user = input_user.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int[] frekuensiKarakter = new int[26];
        int index = 0;
        while (index < input_user.length()) {
            char c = input_user.charAt(index);
            int charIndex = c - 'a';
            frekuensiKarakter[charIndex]++;
            index++;
        }

        char maxChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < frekuensiKarakter.length; i++) {
            if (frekuensiKarakter[i] > maxCount) {
                maxChar = (char) (i + 'a');
                maxCount = frekuensiKarakter[i];
            }
        }
        
        char minChar = ' ';
        int minCount = Integer.MAX_VALUE;
        for (int i = 0; i < frekuensiKarakter.length; i++) {
            if (frekuensiKarakter[i] > 0 && frekuensiKarakter[i] < minCount) {
                minChar = (char) (i + 'a');
                minCount = frekuensiKarakter[i];
            }
        }

        // Output results
        System.out.println("Huruf terbanyak: " + maxChar + " dengan jumlah: " + maxCount);
        System.out.println("Huruf paling sedikit: " + minChar + " dengan jumlah: " + minCount);
    }
}
