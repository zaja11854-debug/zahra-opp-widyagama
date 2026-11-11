class Siswa {
    String nama = "Budi";
    String kelas = "X DPK 1";

    void perkenalan() {
        System.out.println("Halo, saya " + nama + " dari kelas " + kelas);
    }

    public static void main(String[] args) {
        Siswa siswa1 = new Siswa();
        siswa1.perkenalan();
    }
}