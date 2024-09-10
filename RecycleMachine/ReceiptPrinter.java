public class ReceiptPrinter {

    public void print(String itemName, double itemValue) {
        System.out.println("------ Receipt ------");
        System.out.println("Item: " + itemName);
        System.out.println("Total Value: $" + itemValue);
        System.out.println("---------------------");
    }
}
