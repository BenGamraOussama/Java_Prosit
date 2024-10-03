public class ZooManagement {
    public static void main(String[] args) {

        Animal lion = new Animal("Felidae", "lion", 6, true);
        Animal elephant = new Animal("a", "elephant", 3, true);
        Animal zebra = new Animal("b", "zebra", 7, true);
        Animal giraffe = new Animal("c", "giraffe", 2, true);
        Animal panda = new Animal("Ursidés", "Panda", 22, true);

        lion.displayAnimal();

        Zoo myZoo = new Zoo("MyZoo", "Tunis", 3);
        Zoo myzoo1 = new Zoo("zoo1", "Paris", 3);
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana",5);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println("Ajout du lion : " + myZoo.addAnimal(lion)); // true
        System.out.println("Ajout du tigre : " + myZoo.addAnimal(elephant)); // true
        System.out.println("Ajout de la girafe : " + myZoo.addAnimal(giraffe)); // true
        System.out.println("Ajout du zebra : " + myZoo.addAnimal(zebra)); //false, zoo plein
        System.out.println("nobre total des animeaux: " + myZoo.getAnimaux());

        myzoo1.addAnimal(zebra);

        int lionIndex = myZoo.searchAnimal("lion");
        System.out.println("lion trouvé à l'indice : " + lionIndex);

        int elephantIndex = myZoo.searchAnimal("elephant");
        System.out.println("Elephant trouvé à l'indice : " + elephantIndex);


        System.out.println("Suppression giraffe: " + myZoo.removeAnimal(elephant));
        myZoo.displayZoo();
        System.out.println("Suppression zebra: " + myZoo.removeAnimal(zebra));
        System.out.println(myZoo.isZooFull());
        myZoo.displayNombreAnimaux();
        Zoo zooAvecPlusDAnimaux = compareZoo(myZoo, myzoo1);
        System.out.println("Le zoo qui contient le plus grand nombre d'animaux est : " + zooAvecPlusDAnimaux.getNom() + " avec " + zooAvecPlusDAnimaux.displayNombreAnimaux() + " animaux.");
    }
    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.displayNombreAnimaux() > z2.displayNombreAnimaux()) {
            return z1;
        } else if (z1.displayNombreAnimaux() < z2.displayNombreAnimaux()) {
            return z2;
        } else {
            return null;
        }
    }
}