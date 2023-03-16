package OOP;

public class Motor extends Kendaraan {
    Motor() {

    }

    Motor(String warna, String merek, String model, Integer kecepatanMax) {
        
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
}
