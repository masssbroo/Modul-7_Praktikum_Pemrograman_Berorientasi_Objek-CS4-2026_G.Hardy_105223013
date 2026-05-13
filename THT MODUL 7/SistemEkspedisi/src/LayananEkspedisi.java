public class LayananEkspedisi {
    // Atribut menggunakan protected agar bisa diturunkan
    protected String nomorResi;
    protected double beratAktualKg;
    protected double panjang;
    protected double lebar;
    protected double tinggi;

    // Konstruktor untuk menginisialisasi atribut
    public LayananEkspedisi(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        this.nomorResi = nomorResi;
        this.beratAktualKg = beratAktualKg;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Mengembalikan nilai tertinggi antara berat aktual dan volumetrik
    public double hitungBeratEfektif() {
        double beratVolumetrik = (panjang * lebar * tinggi) / 6000.0;
        return Math.max(beratAktualKg, beratVolumetrik);
    }

    // Mencetak nomor resi dan berat efektif
    public void cetakResi() {
        System.out.println("Nomor Resi: " + nomorResi + " | Berat Efektif: " + hitungBeratEfektif() + " Kg");
    }

    // Metode polymorphic yang akan di-override
    public double hitungOngkir() {
        return 0.0;
    }
}