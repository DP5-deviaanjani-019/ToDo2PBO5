public class Tumbuhan {
    private String nama;
    private String jenis;
    private int tinggi;

    public Tumbuhan(String nama, String jenis, int tinggi) {
        this.nama = nama;
        this.jenis = jenis;
        this.tinggi = tinggi;
    }

    public void tumbuh(int tambahanTinggi) {
        tinggi += tambahanTinggi;
        System.out.println(nama + " tumbuh menjadi " + tinggi + " cm.");
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Tinggi: " + tinggi + " cm");
    }
}
