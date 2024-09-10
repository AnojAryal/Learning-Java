public class ToyCar {
    private String color;
    private final int wheels;

    public ToyCar(String color, int wheels) {
        this.color = color;
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void printDetails() {
        System.out.println(String.format("ToyCar color: %s, wheels: %d", color, wheels));
    }

    public static void main(String[] args) {
        ToyCar toyCar = new ToyCar("Blue", 3);

        System.out.println("Before color change:");
        toyCar.printDetails();

        toyCar.setColor("Green");

        System.out.println("After color change");
        System.out.println("Updated Color: " + toyCar.getColor());
        System.out.println("Number of Wheels: " + toyCar.getWheels());
    }
}
