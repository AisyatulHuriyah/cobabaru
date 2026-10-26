package Interface;

// ini terakhir ygy. terus main

public interface PaceCalculatable {
    
    // CATATAN: Ini adalah ATURAN MUTLAK di Interface (PPT Hal 9).
    // Variabel di interface HARUS public static final (konstan/tetap).
    // Artinya, nilainya gak bisa diubah-ubah lagi di tengah jalan.
    public static final String defaultUnit = "min/km";
    
    // CATATAN: Ini juga method abstrak. Wajib diisi (diimplementasikan) oleh class yang pakai interface ini.
    double calculatePace(double distanceKm, int durationMinutes);
    
    // CATATAN: Method abstrak lagi. Tugasnya buat reset data pace.
    void resetPeace(); 
}