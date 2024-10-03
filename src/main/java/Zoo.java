public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int cmt;
    private static final int MAX_ANIMALS = 25;

    public Zoo(int MAX_ANIMALS) {
        this.animals = new Animal[MAX_ANIMALS];
        cmt = 0;
    }

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[MAX_ANIMALS];
        cmt = 0;
    }

    public String getNom() {
        return name;
    }


    public boolean addAnimal(Animal animal) {
        if (cmt >= MAX_ANIMALS) {
            System.out.println("Zoo is full, can't add more animals.");
            return false;
        }


        if (searchAnimal(animal.name) != -1) {
            System.out.println("L'animal existe déjà dans le zoo.");
            return false; // Animal is already in the zoo
        }


        animals[cmt] = animal;
        cmt++;
        System.out.println("Animal ajouté avec succès.");
        return true;
    }

    public void displayZoo() {
        System.out.println("Animals in the zoo:");
        for (int i = 0; i < cmt; i++) {
            System.out.println("- " + animals[i]);
        }
    }
    public void nbranimal() {
        System.out.println("Animals in the zoo:");
        for (int i = 0; i < cmt; i++) {
            System.out.println("- " + animals[i]);
        }
    }
    public int getAnimaux() {
        return cmt;
    }
    public int searchAnimal(String animalName) {
        for (int i = 0; i < cmt; i++) {
            if (animals[i] != null && animals[i].name.equals(animalName)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.getName());
        if (index != -1) {
            for (int i = index; i < cmt - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[cmt - 1] = null;
            cmt--;
            System.out.println("L'animal a été retiré avec succès.");
            return true;
        }
        System.out.println("Animal non trouvé dans le zoo.");
        return false;
    }
    public boolean isZooFull (){
        if (cmt >= MAX_ANIMALS) {
            return false;
        }
        return true;
    }
    public int displayNombreAnimaux() {
        return cmt;
    }
}