public class Tugas2 {
    static int n = 7;
    public static int penjumlahanRekursif(int f) {
        if (f == 0) return 0;
        return f + penjumlahanRekursif(f - 1);
    }
    static void cetakDeret(int f) {
        if (f > 1) {
            System.out.print(f - n + "+");
            n--;
            n--;
            cetakDeret(f - 1);
        } else {
            System.out.print("8 = ");
        }
    }

    public static void main(String[] args) {
        int f = 8;
        int hasil = penjumlahanRekursif(f);
        cetakDeret(f);
        System.out.println(hasil);
    }
}
