package Interface;

// CATATAN: Ini adalah INTERFACE. Sesuai PPT, interface itu ibarat "Soket Listrik".
// Dia cuma ngasih tahu APA yang harus dilakukan, tapi GAK NGASIH TAHU GIMANA caranya.
// Penamaan interface biasanya pakai kata sifat (kemampuan), makanya namanya HeartRateMonitor.
public interface HeartRateMonitor {
    
    // CATATAN: Ini namanya METHOD ABSTRAK (cuma deklarasi).
    // Gak ada kurung kurawal {} di sini. Titik koma di akhir udah cukup.
    // Siapa pun class yang pakai interface ini, WAJIB punya method trackHeartRate().
    void trackHeartRate();
}