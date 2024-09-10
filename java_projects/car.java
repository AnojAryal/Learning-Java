
class Car {
    // private to enforce encapsulation
    private String color;
    private int year;

    // Constructor to initialize the object with values
    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    // Getter and Setter methods for accessing and modifying the fields
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

   
    public void drive() {
        System.out.println(String.format("Driving the %s car in %d", color, year));
    }

    public static void main(String[] args) {
        Car car1 = new Car("green", 2024);
        Car car2 = new Car("yellow", 2024);

        car1.drive();
        car2.drive();
    }
}

