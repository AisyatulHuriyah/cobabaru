package Interface;

public class Main {
    public static void main(String[] args) {
        
        // CATATAN: Kita bikin objek CasualBand. 
        // Perhatikan: tipe datanya 'CasualBand', bukan 'SmartBand' atau 'HeartRateMonitor' ya!
        // Karena Interface dan Abstract Class gak boleh di-new.
        System.out.println("--- TEST CASUAL BAND ---");
        CasualBand casual = new CasualBand("Xiaomi Mi Band", 80);
        casual.displayInfo();       // Panggil method milik CasualBand
        casual.trackHeartRate();    // Panggil method hasil dari kontrak Interface
        casual.syncData();          // Panggil method warisan dari induk

        // CATATAN: Bikin objek ProRunnerBand.
        System.out.println("\n--- TEST PRO RUNNER BAND ---");
        ProRunnerBand pro = new ProRunnerBand("Garmin", 95);
        pro.displayInfo();
        pro.trackHeartRate();
        
        // CATATAN: Manggil method calculatePace() milik ProRunnerBand.
        // Variabel PaceCalculatable.defaultUnit itu ngambil dari interface (warna biru).
        double pacePro = pro.calculatePace(5.0, 25);
        System.out.println("Pace: " + pacePro + " " + PaceCalculatable.defaultUnit);

        // CATATAN: Bikin objek EliteRunnerBand (yang punya banyak warisan).
        System.out.println("\n--- TEST ELITE RUNNER BAND ---");
        EliteRunnerBand elite = new EliteRunnerBand("Polar", 100);
        elite.displayInfo();
        
        // CATATAN: calculatePace() bisa dipanggil karena EliteRunnerBand mewarisi ini dari ProRunnerBand.
        double paceElite = elite.calculatePace(10.0, 40);
        System.out.println("Pace: " + paceElite + " " + PaceCalculatable.defaultUnit);
        
        // CATATAN: resetPeace() dipanggil dari hasil 'implements' interface PaceCalculatable.
        elite.resetPeace();
    }
}