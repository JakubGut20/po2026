package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;


public class Zoo {

    private Animal[] animals = new Animal[100];

    public Zoo() {

        for (int i = 0; i < animals.length; i++) {
            int wylosowana = (int) (Math.random() * (3 - 1 + 1) + 1);

            switch (wylosowana) {
                case 1:
                    animals[i] = new Dog("Pies nr " + i);
                    break;
                case 2:
                    animals[i] = new Parrot("Papuga nr " + i);
                    break;
                case 3:
                    animals[i] = new Snake("Wąż nr " + i);
                    break;
            }
        }
    }

    public int liczNogi() {
        int sum = 0;
        for (int i = 0; i < animals.length; i++) {
            sum += animals[i].getLegs();
        }
        return sum;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println("Suma nóg to: " + zoo.liczNogi());

        for (int i = 0; i < zoo.animals.length; i++) {
            Animal animal = zoo.animals[i];
            String opis = animal.getDescription();
            int legs = animal.getLegs();
            animal.makeSound();
            System.out.println(opis + " | nogi: " + legs);
        }
    }

}