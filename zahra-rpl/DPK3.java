class Produk {
    String namaProduk;
    double harga;

    // Konstruktor
    Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public static void main(String[] args) {
        Produk produk1 = new Produk("Buku", 15000);

        System.out.println("Nama Produk: " + produk1.namaProduk);
        System.out.println("Harga: Rp" + produk1.harga);
    }
}