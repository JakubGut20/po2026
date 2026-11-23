package agh.po.symulator;

public class Samochod {
    Silnik silnik;
    SkrzyniaBiegow skrzynia;
    Pozycja aktualnaPozycja;

    public void wlacz() {
        silnik.uruchom();
    }
    public void wylacz() {
        silnik.zatrzymaj();
        skrzynia.ustawBieg(0);
    }

}

