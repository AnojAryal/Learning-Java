public class Can extends DepositItem {

    public double weight;
    public String size;

    // Constructor to initialize all attributes
    public Can(int number, double value, double weight, String size) {
        super(number, value);
        this.weight = weight;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Can { " +
               "number = " + number +
               ", value = $" + value +
               ", weight = " + weight + " kg" +
               ", size = " + size +
               " }";
    }
}
