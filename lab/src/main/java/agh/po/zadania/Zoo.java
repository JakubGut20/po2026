package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

import java.util.Random;


public class Zoo {

   private Animal[] animals = new Animal[100];

    public Zoo() {
        Random random = new Random();

        for(int i = 0; i < animals.length; i++) {
            int wylosowana = (int)(Math.random()*(3-1+1) + 1);

            switch(wylosowana) {
                case 1:
                    animals[i] = new Dog("pies nr " + i);
                    break;
                case 2:
                    animals[i] = new Parrot("pies nr " + i);
                    break;
                case 3:
                    animals[i] = new Snake("pies nr " + i);
                    break;
            }
            }
        }

        public int liczNogi() {
        int sum = 0;

        }
    }