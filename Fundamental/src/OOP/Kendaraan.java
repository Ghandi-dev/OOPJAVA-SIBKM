package OOP;

public abstract class Kendaraan {
    private String warna;
    private String merek;
    private String model;
    private Integer kecepatanMax;

    Kendaraan() {

    }

    Kendaraan(String warna, String merek, String model, Integer kecepatanMax) {
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

    public Integer getKecepatanMax() {
        return kecepatanMax;
    }

    public void setKecepatanMax(Integer kecepatanMax) {
        this.kecepatanMax = kecepatanMax;
    }

    abstract void maju();

    abstract void berhenti();

    abstract int jumlahRoda();

}
