public class Main {
    public static void main(String[] args) {

        Animal cow = new Cow("Bob",3,"Black");
        Animal wolf = new Wolf("Jack",5,"White");
        Animal fish = new Fish("Nemo",1,"Forel");
        Animal[] animal = {cow,wolf,fish};
        for (Animal a:animal) {
            System.out.println(a);
            a.eat();
            a.livePlace();
        }
    }
}