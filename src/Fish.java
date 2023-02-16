public class Fish extends Animal{
    private String type;

    public Fish(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public Fish(String type) {
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println("fish are swiming...");
    }

    @Override
    public void livePlace() {
        System.out.println("sish lives in the sea");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "type='" + type + '\'' +
                '}'+super.toString();
    }
}
