public class Bottle extends DepositItem {
    
    public double weight;
    public String size;

    public Bottle(int number, double value, double weight, String size) {
        super(number, value);
        this.weight = weight;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bottle { " +
               "number = " + number +
               ", value = $" + value +
               ", weight = " + weight + " kg" +
               ", size = " + size +
               " }";
    }

}
