package agh.po.symulator;

public class Sprzeglo extends Komponent {
    private boolean stanSprzegla;

    public void wcisnij() {
        stanSprzegla = true;
    }
    public void zwolnij() {
        stanSprzegla = false;
    }
    public boolean getStanSprzegla() {
        return stanSprzegla;
    }

    public Sprzeglo(String nazwa, int waga, double cena) {
        super(nazwa, waga, cena);
        this.stanSprzegla = false;
    }
}
