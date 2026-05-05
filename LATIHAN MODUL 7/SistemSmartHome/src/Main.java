import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== IMPLEMENTASI SOAL 3 & 4 ===");
        
        // Deklarasi ArrayList dengan tipe Superclass
        ArrayList<PerangkatPintar> koleksiPerangkat = new ArrayList<>();

        // Upcasting
        PerangkatPintar lampu = new LampuPintar();
        PerangkatPintar ac = new AcPintar();

        koleksiPerangkat.add(lampu);
        koleksiPerangkat.add(ac);

        for (PerangkatPintar perangkat : koleksiPerangkat) {
            
            // Soal 3: Memanggil metode aktifkan (Polymorphism berjalan di sini)
            perangkat.aktifkan(); 

            // Soal 4: Deteksi tipe objek dengan instanceof dan lakukan Downcasting
            if (perangkat instanceof AcPintar) {
                AcPintar acSpesifik = (AcPintar) perangkat;
                acSpesifik.aturSuhu(20); 
            }
        }

        System.out.println("\n=== IMPLEMENTASI SOAL 5 (Perbaikan Error) ===");
        
        //(Upcasting)
        PerangkatPintar alat1 = new LampuPintar();
        
        
        // Melakukan Downcasting ke LampuPintar agar metode aturKecerahan dikenali Compiler
        ((LampuPintar) alat1).aturKecerahan(75, "Putih");
        
    }
}