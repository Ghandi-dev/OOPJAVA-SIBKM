package OOP;

public class Mobil extends Kendaraan {

    Mobil() {

    }

    Mobil(String warna, String merek, String model, Double kecepatanMax) {
        super(warna, merek, model, kecepatanMax);

    }

    @Override
    void maju() {
        System.out.println("Mobil berjalan maju");
    }

    void mundur() {
        System.out.println("Mobil mundur");
    }

    @Override
    void berhenti() {
        System.out.println("Mobil berhenti");
    }

    @Override
    int jumlahRoda() {
        return 4;
    }

}
