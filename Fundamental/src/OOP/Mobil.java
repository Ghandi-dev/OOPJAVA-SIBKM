package OOP;

public class Mobil extends Kendaraan {

    public Mobil() {

    }

    public Mobil(String warna, String merek, String model, Double kecepatanMax) {
        super(warna, merek, model, kecepatanMax);

    }

    @Override
    void maju() {
        System.out.printf("Mobil %s %s berjalan maju", getMerek(), getModel());
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

    @Override
    void deskripsi() {
        System.out.printf("Model mobil : %s \n", getModel());
        System.out.printf("Merek mobil : %s \n", getMerek());
        System.out.printf("Warna mobil : %s \n", getWarna());
        System.out.printf("Jumlah ban : %d \n", jumlahRoda());
        System.out.printf("Kecepatan maximal : %s Km/h \n", getKecepatanMax());
    }

}
