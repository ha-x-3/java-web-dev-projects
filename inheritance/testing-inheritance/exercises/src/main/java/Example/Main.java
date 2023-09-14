package Example;

public class Main {

    public static void main(String[] args) {

        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());

        //Example.Cat plainCat = new Example.Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        //System.out.println(plainCat.noise());
        System.out.println(cheshireCat.noise());
    }

}
