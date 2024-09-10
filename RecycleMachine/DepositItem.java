public class DepositItem {
    public int number;
    public double value;

    // Constructor to initialize the attributes
    public DepositItem(int number, double value) {
        this.number = number;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "DepositItem { " +
               "number = " + number +
               ", value = $" + value +
               " }";
    }
}
