package agh.po.lab2;
import java.util.ArrayList;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=0;i<6;i++) {
            int liczba = (int)(Math.random()*(49-1+1)+1);
            if(lista.contains(liczba)) {
                i--;
            } else {
                lista.add(liczba);
            }
        }
        System.out.print("Wylosowane liczby: ");
        System.out.println(lista);

        ArrayList<Integer> lista2 = new ArrayList<>();
        for(int j=0;j<6;j++) {
            lista2.add(Integer.parseInt(args[j]));
            }
        System.out.print("Twoje typy: ");
        System.out.println(lista2);

        int licznik = 0;

        for(int k = 0; k<6; k++) {
            if(lista.contains(lista2.get(k))) {
                licznik++;
            }
        }

        System.out.print("Liczba trafień: ");
        System.out.println(licznik);

        long czas1 = System.currentTimeMillis();
        int licznikRazy = 0;
        ArrayList<Integer> lista3 = new ArrayList<>();
        while(true) {
            for(int m=0;m<6;m++) {
                int liczba2 = (int)(Math.random()*(49-1+1)+1);
                if(lista3.contains(liczba2)) {
                    m--;
                } else {
                    lista3.add(liczba2);
                }
            }
            lista3.retainAll(lista2);
            if(lista3.size() == 6) {
                break;
            }
            licznikRazy++;
        }
        long czas2 = System.currentTimeMillis();
        long czaswyk = czas2 - czas1;
        System.out.println(licznikRazy);
        }
    }
