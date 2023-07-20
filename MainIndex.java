
package uaspbo1;

import java.util.Scanner;
import java.util.Arrays;

public class MainIndex {
    public static void main(String[] args) {
       
        Menu menu1 = new Menu("Nasi Goreng", 25000);
        Menu menu2 = new Menu("Mie Ayam", 20000);
        Menu menu3 = new Menu("Ayam Bakar", 30000);
        Menu menu4 = new Menu("Jus Jeruk", 10000);
        Menu menu5 = new Menu("Teh", 5000);
        
       System.out.println("Menu Restoran:");
       Menu[] menuArray = {menu1, menu2, menu3, menu4, menu5};
       for (int i = 0; i < menuArray.length; i++) {
           System.out.println((i + 1) + ". " + menuArray[i].getNama() + " - Rp" + menuArray[i].getHarga());}
       
       Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih menu (1-5): ");
        int pilihanMenu = scanner.nextInt();
        if (pilihanMenu < 1 || pilihanMenu > 5) {
            System.out.println("Menu tidak valid.");
            return;
        }

        System.out.print("Jumlah pesanan: ");
        int jumlahPesanan = scanner.nextInt();
        if (jumlahPesanan <= 0) {
            System.out.println("Jumlah pesanan harus lebih dari 0.");
            return;
        }

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
            case 4:
                menuPesanan = menu4;
                break;
            case 5:
                menuPesanan = menu5;
                break;
            default:
                System.out.println("Menu tidak valid.");
                return;
        }

        System.out.print("Apakah pesanan mau diantar? (y/n): ");
        String isDelivery = scanner.next();

        Pesanan pesanan;
        if (isDelivery.equalsIgnoreCase("y")) {
            System.out.print("Masukkan alamat pengiriman: ");
            String alamat = scanner.next();
            if (alamat.isEmpty()) {
                System.out.println("Alamat pengiriman tidak boleh kosong.");
                return;}
            pesanan = new PesananDelivery(menuPesanan, jumlahPesanan, alamat); 
        } else {
            pesanan = new Pesanan(menuPesanan, jumlahPesanan);
        }

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
