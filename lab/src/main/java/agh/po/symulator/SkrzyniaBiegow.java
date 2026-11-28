package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent {
    private  int aktualnyBieg;
    private int iloscBiegow;
    private Sprzeglo sprzeglo;

    public void zwiekszBieg() {
        if (sprzeglo.getStanSprzegla() && aktualnyBieg < iloscBiegow) {
            aktualnyBieg++;
        }
    }
    public void zmniejszBieg() {
        if(sprzeglo.getStanSprzegla() && aktualnyBieg > 0) {
            aktualnyBieg--;
        }
    }
    public void ustawBieg(int bieg) {
        if(bieg >= 0 && bieg <= iloscBiegow) {
            aktualnyBieg = bieg;
        }
    }

    public int getAktualnyBieg() {
        return aktualnyBieg;
    }

    public Sprzeglo getSprzeglo() {
        return sprzeglo;
    }

    public SkrzyniaBiegow(String nazwa, int waga, double cena, int iloscBiegow, Sprzeglo sprzeglo){
        super(nazwa, waga, cena);
        this.iloscBiegow = iloscBiegow;
        this.sprzeglo = sprzeglo;
        this.aktualnyBieg = 0;
    }
}