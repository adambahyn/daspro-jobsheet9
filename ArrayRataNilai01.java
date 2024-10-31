import java.util.*;

public class ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah = 0;
        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlah = sc.nextInt();
        int[] nilaiMhs = new int[jumlah];
        double lulus = 0, tidaklulus = 0;
        double nilailulus = 0, nilaitidaklulus = 0, ratalulus = 0, ratatidaklulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                nilailulus += nilaiMhs[i];
                lulus++;
            } else {
                nilaitidaklulus += nilaiMhs[i];
                tidaklulus++;
            }
        }

        ratalulus = nilailulus / lulus;
        ratatidaklulus = nilaitidaklulus / tidaklulus;

        System.out.println("Rata-rata lulus = " + ratalulus);
        System.out.println("Rata-rata lulus = " + ratatidaklulus);
    }
}