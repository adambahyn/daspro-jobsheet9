import java.util.*;

public class SearchNilai01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jml = 0;
        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        jml = sc.nextInt();

        int[] arrNilai = new int[jml];
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        int key = 0;
        System.out.print("Masukkan nilai yang ingin dicari : ");
        key = sc.nextInt();

        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }

        if (hasil != 0) {
            System.out.println();
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Nilai yang dicari tidak ditemukan");
            System.out.println();
        }
    }
}
