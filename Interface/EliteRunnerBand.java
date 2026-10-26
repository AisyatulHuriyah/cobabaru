package Interface;

// habis dari pro runner band terus ke sini, terus ke pace calculatable

// CATATAN: Dia adalah anak dari ProRunnerBand (Cucu dari SmartBand).
// Dia juga implements kontrak PaceCalculatable.
public class EliteRunnerBand extends ProRunnerBand implements PaceCalculatable {

    public EliteRunnerBand(String brandName, int batteryLevel) {
        super(brandName, batteryLevel); // Manggil constructor ProRunnerBand
    }

    // CATATAN: Kita GAK PERLU nulis method calculatePace() lagi di sini.
    // Kenapa? Karena dia udah mewarisi (inherit) method itu dari ProRunnerBand (bapaknya).
    // Tapi, dia WAJIB nulis method resetPeace() karena itu kontrak dari interface PaceCalculatable.
    @Override
    public void resetPeace() {
        System.out.println("Mereset pace untuk Elite Runner...");
    }
}