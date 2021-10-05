package ch07;

public class AnimalTest2 {
    public static void main(String[] args) {
        BigCat bc = new BigCat();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();


        animalCrying(bc);
        animalCrying(cat);
        animalCrying(dog);
        animalCrying(cow);
    }

    public static void animalCrying(Animal ani){
        ani.crying();

    }
}
