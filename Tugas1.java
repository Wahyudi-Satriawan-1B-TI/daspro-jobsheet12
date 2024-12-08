public class Tugas1 {
    public static void deretDescendingRekursif(int n) {
        if (n < 0) return;
        System.out.print(n + " ");
        deretDescendingRekursif(n - 1);
    }

    public static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Rekursif:");
        deretDescendingRekursif(n);
        System.out.println("\nIteratif:");
        deretDescendingIteratif(n);
    }
}
