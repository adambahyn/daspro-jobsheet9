import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai mahasiswa yang akan diinput: ");
        int jmlMhs = scanner.nextInt();
        
        int[] nilaiMhs = new int[jmlMhs];
        double totalNilai = 0;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("\nMasukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = scanner.nextInt();
            totalNilai += nilaiMhs[i];
        }

        System.out.println("\nNilai mahasiswa yang telah dimasukkan:");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("nilai mahasiswa ke-" + i + " = " + nilaiMhs[i]);

        }
        
        double rataRata = (double) totalNilai / jmlMhs;
        System.out.println("\nNilai rata-rata: " + rataRata);

        int nilaiTertinggi = 0;
        int nilaiTerendah = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

    }
}
