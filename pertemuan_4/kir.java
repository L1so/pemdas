import java.util.Scanner;

public class kir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tinggi badan (cm): ");
        double tinggi = scanner.nextDouble();
        System.out.print("Berat badan (kg): ");
        double berat = scanner.nextDouble();
        double tinggiMeters = tinggi / 100;
        double hasilBMI = berat / (tinggiMeters * tinggiMeters);
        String diagnosa;
        if (hasilBMI >= 30) {
            diagnosa = "Obese";
        } else if (hasilBMI >= 25 && hasilBMI < 30) {
            diagnosa = "Overweight";
        } else if (hasilBMI >= 18.5 && hasilBMI < 25) {
            diagnosa = "Normal";
        } else {
            diagnosa = "Underweight";
        }
        System.out.println("Nilai BMI anda " + String.format("%.1f", hasilBMI) + " dan anda dinyatakan " + diagnosa);
        scanner.close();
    }
}
