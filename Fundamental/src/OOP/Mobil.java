package OOP;

public class Mobil extends Kendaraan {
    
    Mobil(){

    }
    Mobil(String warna,String merek, String model, Integer kecepatanMax ){
        super(warna,merek,model,kecepatanMax);
        
    }

    @Override
    void maju() {
        System.out.println("Mobil berjalan maju");
    }
    @Override
    void berhenti() {
       System.out.println("Mobil berhenti");
    }
    @Override
    int jumlahRoda() {
       return 4;
    }}
