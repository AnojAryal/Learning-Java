public class Crate extends DepositItem {
    public double weight;
    public String size;

    public Crate(int number, double value, double weight, String size) {
        super(number, value);
        this.weight = weight;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Crate { " +
               "number = " + number +
               ", value = $" + value +
               ", weight = " + weight + " kg" +
               ", size = " + size +
               " }";
    }

}
