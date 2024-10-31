import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        // Daftar menu makanan yang telah diinisialisasi
        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice" };

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cariMakanan = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (cariMakanan.equalsIgnoreCase(menu[i])) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan '" + cariMakanan + "' tersedia di menu.");
        } else {
            System.out.println("Makanan '" + cariMakanan + "' tidak ditemukan di menu.");
        }
    }
}
