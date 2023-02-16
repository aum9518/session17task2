public class Wolf extends Animal{
    private String color;

    public Wolf(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public Wolf(String color) {
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
        System.out.println("Wolf eating sheep...");
    }

    @Override
    public void livePlace() {
        System.out.println("Wolf lives in the forest...");
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "color='" + color + '\'' +
                '}'+super.toString();
    }
}
