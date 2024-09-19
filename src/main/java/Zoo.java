public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages){
        animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void displayZoo(){
        System.out.println("animals : "+animals+" name: "+name+ " city :"+city+" nombres des cages :"+nbrCages);
    }

    public String toString() {
        return "animals :" + animals  + ", name : " + name  + ", city : " + city + ", nombres des cages : " + nbrCages ;
    }
}
