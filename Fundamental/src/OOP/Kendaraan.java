package OOP;

public abstract class Kendaraan {
    private String warna;
    private String merek;
    private String model;
    private Double kecepatanMax;

    public Kendaraan() {

    }

    public Kendaraan(String warna, String merek, String model, Double kecepatanMax) {
        this.warna = warna;
        this.merek = merek;
        this.model = model;
        this.kecepatanMax = kecepatanMax;

    }

    public String getWarna() {
        return warna;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public Double getKecepatanMax() {
        return kecepatanMax;
    }

    public void setKecepatanMax(Double kecepatanMax) {
        this.kecepatanMax = kecepatanMax;
    }

    abstract void deskripsi();

    abstract void maju();

    abstract void berhenti();

    abstract int jumlahRoda();

}
