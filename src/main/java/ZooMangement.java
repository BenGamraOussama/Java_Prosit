public class ZooMangement {
    public static void main(String[] args) {
        Animal lion = new Animal("carnivore", "lion", 5, true);
        lion.displayAnimal();
        Zoo myZoo = new Zoo("zoo", "Tunis", 10);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion);
    }
}
