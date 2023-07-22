
package uaspbo1;


public class Pesanan {
   private Menu menu;
   private int jumlah;
    private double diskon;

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public Pesanan(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
        this.diskon = 0;
        
    }

    public Menu getMenu() {
        return menu;
    }


    public int getJumlah() {
        return jumlah;
    }

    public double getTotalHarga() {
        double totalHarga = menu.getHarga() * jumlah;
        return totalHarga - diskon;
    }
}
