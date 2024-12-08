public class Tugas3 {
    public static int fibonacci(int bulan) {
        if (bulan == 1 || bulan == 2) return 1;
        return fibonacci(bulan - 1) + fibonacci(bulan - 2);
    }

    public static void main(String[] args) {
        int bulan = 12;
        for (int i = 1; i <= bulan; i++) {
            System.out.println("Bulan ke-" + i + ": " + fibonacci(i) + " pasangan marmut");
        }
    }
}
