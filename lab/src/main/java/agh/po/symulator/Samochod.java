package agh.po.symulator;

public class Samochod {
    Silnik silnik;
    SkrzyniaBiegow skrzynia;
    Pozycja aktualnaPozycja;

    public Samochod(Silnik silnik, SkrzyniaBiegow skrzynia, Pozycja aktualnaPozycja) {
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.aktualnaPozycja = aktualnaPozycja;
    }

    public void wlacz() {
        silnik.uruchom();
    }
    public void wylacz() {
        silnik.zatrzymaj();
        skrzynia.ustawBieg(0);
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public SkrzyniaBiegow getSkrzynia() {
        return skrzynia;
    }

    public Pozycja getAktualnaPozycja() {
        return aktualnaPozycja;
    }


    public static void main(String[] args) {
        Sprzeglo sprzeglo = new Sprzeglo("Sprzeglo", 6, 450.0);
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("6-biegowa", 45, 2800.0, 6, sprzeglo);
        Silnik silnik = new Silnik("1.8 TDI", 150, 5500.0, 5000);
        Pozycja pozycjaStarowa = new Pozycja(0.0,0.0);

        Samochod mojSamochod = new Samochod(silnik, skrzynia,pozycjaStarowa);

        mojSamochod.wlacz();
        System.out.println("Obroty po włączeniu: " + mojSamochod.getSilnik().getObroty());

        mojSamochod.getSkrzynia().getSprzeglo().wcisnij();
        mojSamochod.getSkrzynia().zwiekszBieg();
        mojSamochod.getSkrzynia().getSprzeglo().zwolnij();

        System.out.println("Aktualny bieg: " + mojSamochod.getSkrzynia().getAktualnyBieg());
        System.out.println("Stan sprzegla: " + mojSamochod.getSkrzynia().getSprzeglo().getStanSprzegla());
        System.out.println(mojSamochod.getAktualnaPozycja().getPozycja());

        mojSamochod.wylacz();
        System.out.println("Obroty: " + mojSamochod.getSilnik().getObroty() + " Bieg: " + mojSamochod.getSkrzynia().getAktualnyBieg());
    }
}

