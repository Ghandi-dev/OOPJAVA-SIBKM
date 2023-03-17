package OOP;

public class Main {
    public static void main(String[] args) {
        // Object Mobil
        Mobil Avanza = new Mobil();
        Avanza.setWarna("Hitam");
        Avanza.setMerek("Toyota");
        Avanza.setModel("Avanza");
        Avanza.setKecepatanMax(300.0);
        Avanza.deskripsi();
        Avanza.maju();
    }
}
