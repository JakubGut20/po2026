package agh.po.animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, 4);
    }

    public String getDescription() {
        return "Pies o imieniu: " + name;
    }

    public void makeSound() {
        System.out.println(name + " szczeka");
    }
}
