
package uaspbo1;


public class PesananDelivery extends Pesanan {
   private String alamat;

    public PesananDelivery(Menu menu, int jumlah, String alamat) {
        super(menu, jumlah);
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    @Override
    public double getTotalHarga() {
        // Menggunakan harga dasar pesanan ditambah biaya pengiriman
        double totalHargaPesanan = super.getTotalHarga();
        double biayaPengiriman = 7000;
        if (getJumlah() > 3) {
            double diskon = totalHargaPesanan * 0.1; // Diskon 10% dari total harga
            setDiskon(diskon);
            totalHargaPesanan -= diskon;
        }

        return totalHargaPesanan + biayaPengiriman;
    }
}
