package agh.po.symulator;

public abstract class Komponent {
    private String nazwa;
    private int waga;
    private double cena;

    public String getNazwa() {
        return nazwa;
    }

    public int getWaga() {
        return waga;
    }

    public double getCena() {
        return cena;
    }

    public Komponent(String nazwa, int waga, double cena) {
        this.nazwa=nazwa;
        this.waga=waga;
        this.cena=cena;
    }
}
