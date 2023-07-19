
package uaspbo1;

import java.util.Scanner;


public class MainIndex {
    public static void main(String[] args) {
        // Membuat menu-menu restoran
        Menu menu1 = new Menu("Nasi Goreng", 25000);
        Menu menu2 = new Menu("Mie Ayam", 20000);
        Menu menu3 = new Menu("Ayam Bakar", 30000);

        // Memilih menu dan jumlah pesanan
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu Restoran:");
        System.out.println("1. " + menu1.getNama() + " - Rp" + menu1.getHarga());
        System.out.println("2. " + menu2.getNama() + " - Rp" + menu2.getHarga());
        System.out.println("3. " + menu3.getNama() + " - Rp" + menu3.getHarga());

        System.out.print("Pilih menu (1-3): ");
        int pilihanMenu = scanner.nextInt();

        System.out.print("Jumlah pesanan: ");
        int jumlahPesanan = scanner.nextInt();

        // Membuat pesanan
        Menu menuPesanan;
        switch (pilihanMenu) {
            case 1:
                menuPesanan = menu1;
                break;
            case 2:
                menuPesanan = menu2;
                break;
            case 3:
                menuPesanan = menu3;
                break;
            default:
                System.out.println("Menu tidak valid.");
                return;
        }

        System.out.print("Apakah pesanan untuk delivery? (y/n): ");
        String isDelivery = scanner.next();

        Pesanan pesanan;
        if (isDelivery.equalsIgnoreCase("y")) {
            System.out.print("Masukkan alamat pengiriman: ");
            String alamat = scanner.nextLine();
            pesanan = new PesananDelivery(menuPesanan, jumlahPesanan, alamat);
        } else {
            pesanan = new Pesanan(menuPesanan, jumlahPesanan);
        }

        // Menampilkan detail pesanan
        System.out.println("\nDetail Pesanan:");
        System.out.println("Menu: " + pesanan.getMenu().getNama());
        System.out.println("Harga per item: Rp" + pesanan.getMenu().getHarga());
        System.out.println("Jumlah pesanan: " + pesanan.getJumlah());
        System.out.println("Total harga: Rp" + pesanan.getTotalHarga());

        if (pesanan instanceof PesananDelivery) {
            PesananDelivery pesananDelivery = (PesananDelivery) pesanan;
            System.out.println("Alamat pengiriman: " + pesananDelivery.getAlamat());
        }
    }

}
