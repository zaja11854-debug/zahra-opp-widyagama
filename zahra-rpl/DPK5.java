class Barang {
    String nama;
    int harga;
    int stok;

    // Konstruktor
    Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Metode beli
    void beli(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println("Berhasil membeli " + jumlah + " " + nama);
        } else {
            System.out.println("Stok tidak cukup!");
        }
    }

    // Metode info
    void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + stok);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Barang barang1 = new Barang("Buku", 10000, 10);
        Barang barang2 = new Barang("Pensil", 3000, 5);

        barang1.beli(3);
        barang2.beli(2);
        barang2.beli(10);

        System.out.println("\nData Barang:");
        barang1.info();
        barang2.info();
    }
}