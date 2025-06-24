package javaPro.lesson3.task1;

public class AnimalDemo {

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Dog(),
                new Cat(),
                new Dog()
        };

        printOnlyDogs(animals);
    }

    public static void printOnlyDogs(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal.getType().equals("Dog")) {
                System.out.println(animal);
            }
        }
    }

}