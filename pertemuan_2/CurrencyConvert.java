public class CurrencyConvert {
    public static void main(String[] args) {
        String batas = new String(new char[121]).replace("\0", "-");
        String[] mata_uang = {
                "AUD", "CAD", "CHF", "CNY", "DKK", "EUR", "GBP", "HKD", "JPY", "MYR", "NOK", "NZD", "SAR", "SEK", "SGD", "THB", "USD"
        };

        String[] headers = {
                "Mata Uang", "Special Rate", "TT Counter", "Bank Notes", "Beli", "Jual"
        };
        double[][] kurs = {
                { 9.834, 9.853, 9.657, 10.045, 9.657, 10.045 },
                { 11.276, 11.298, 11.129, 11.460, 11.129, 11.460 },
                { 17.185, 17.215, 16.850, 17.577, 16.850, 17.577 },
                { 2.095, 2.108, 2.055, 2.158, 2.055, 2.158 },
                { 2.177, 2.240, 2.126, 2.298, 0.0, 0.0 },
                { 16.461, 16.490, 16.245, 16.725, 16.245, 16.725 },
                { 19.163, 19.195, 18.925, 19.456, 18.925, 19.456 },
                { 1.955, 1.963, 1.890, 2.034, 1.890, 2.034 },
                { 104.53, 104.74, 102.91, 106.49, 102.91, 106.49 },
                { 3.276, 3.288, 3.159, 3.416, 3.159, 3.416 },
                { 1.388, 1.491, 1.383, 1.498, 0.0, 0.0 },
                { 9.051, 9.070, 8.896, 9.238, 8.896, 9.238 },
                { 4.082, 4.098, 3.914, 4.283, 3.914, 4.283 },
                { 1.357, 1.406, 1.341, 1.424, 0.0, 0.0 },
                { 11.258, 11.280, 11.099, 11.453, 11.099, 11.453 },
                { 428.00, 432.00, 411.00, 453.00, 0.0, 0.0 },
                { 15.330, 15.350, 15.200, 15.500, 15.200, 15.500 }
        };
        System.out.print(batas + "\n");
        System.out.printf("| %-10s%-12s%-24s%-12s%-24s%-14s%-22s|%n", headers[0], "|", headers[1], "|", headers[2], "|", headers[3]);
        System.out.printf("| %-10s%-6s%-12s%-6s%-12s%-6s%-12s%-6s%-12s%-6s%-12s%-6s%-12s|%n",
                "", "|", headers[4], "|", headers[5], "|", headers[4], "|", headers[5], "|", headers[4], "|", headers[5], "|");
        System.out.print(batas + "\n");

        //System.out.printf("%-20f", kurs[1][5]);
        for (int i = 0; i < mata_uang.length; i++) {
            System.out.printf("| %-9s ", mata_uang[i]);
            for (int j = 0; j < kurs[i].length; j++) {
                System.out.printf("| %-15s ", kurs[i][j]);
            }
            System.out.printf("%s%n", "|");
        }
        System.out.print(batas + "\n");
    }
}