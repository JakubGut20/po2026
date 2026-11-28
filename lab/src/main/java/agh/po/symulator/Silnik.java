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

    public void zwiekszObroty() {
        if(obroty > 0) {
            obroty = Math.min(obroty + 500, maxObroty);
        }
    }

    public void zmniejszObroty() {
        if(obroty > 0) {
            obroty = Math.max(obroty - 500, 800);
        }
    }

    public int getObroty() {
        return obroty;
    }

    public int getMaxObroty() {
        return maxObroty;
    }

    public Silnik(String name, int waga, double cena, int maxObroty) {
        super(name, waga, cena);
        this.maxObroty = maxObroty;
        this.obroty = 0;
    }
}
