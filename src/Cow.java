public class Cow extends Animal{
    private String color;

    public Cow(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public Cow(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Cow is eating...");
    }

    @Override
    public void livePlace() {
        System.out.println("Cow lives in the field");
    }

    @Override
    public String toString() {
        return "Cow{" +
                "color='" + color + '\'' +
                '}'+super.toString();
    }
}
