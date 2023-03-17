package OOP;

public class Motor extends Kendaraan {
    public Motor() {

    }

    public Motor(String warna, String merek, String model, Double kecepatanMax) {
        super(warna, merek, model, kecepatanMax);

    }

    @Override
    void maju() {
        System.out.println("Motor berjalan maju");
    }

    @Override
    void berhenti() {
        System.out.println("Motor berhenti");
    }

    @Override
    int jumlahRoda() {
        return 2;

    }

    @Override
    void deskripsi() {
        System.out.printf("Model motor : %s \n", getModel());
        System.out.printf("Merek motor : %s \n", getMerek());
        System.out.printf("Warna motor : %s \n", getWarna());
        System.out.printf("Kecepatan maximal : %s Km/h \n", getKecepatanMax());
    }
}
