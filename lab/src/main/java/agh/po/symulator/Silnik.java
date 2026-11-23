package agh.po.symulator;

public class Silnik extends Komponent {
    private int maxObroty;
    private int obroty;

    public void uruchom() {
        obroty = 800;
    }
    public void zatrzymaj() {
        obroty = 0;

    }

    public Silnik(String name, int waga, float cena) {
        super(name, waga, cena);
    }
}
