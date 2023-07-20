
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

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    @Override
    public double getTotalHarga() {
        // Menggunakan harga dasar pesanan ditambah biaya pengiriman
        double totalHargaPesanan = super.getTotalHarga();
        double biayaPengiriman = 7000;
        return totalHargaPesanan + biayaPengiriman;
    }
}
