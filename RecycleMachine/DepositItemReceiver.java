import java.util.HashMap;
import java.util.Map;

public class DepositItemReceiver {

    // Maps to simulate classification of items and their values
    private final Map<Integer, Class<? extends DepositItem>> itemTypes;
    private final Map<Class<? extends DepositItem>, Double> itemValues;

    // Constructor to initialize item types and their values
    public DepositItemReceiver() {
        itemTypes = new HashMap<>();
        itemTypes.put(1, Bottle.class);
        itemTypes.put(2, Can.class);
        itemTypes.put(3, Crate.class);

        itemValues = new HashMap<>();
        itemValues.put(Bottle.class, 0.10);
        itemValues.put(Can.class, 0.05); 
        itemValues.put(Crate.class, 0.15); 
    }

    // Method to classify the item based on an item code
    public DepositItem classifyItem(int itemCode) {
        Class<? extends DepositItem> itemClass = itemTypes.get(itemCode);
        if (itemClass != null) {
            try {
                DepositItem item = itemClass.getDeclaredConstructor(int.class, double.class, double.class, String.class)
                    .newInstance(itemCode, itemValues.get(itemClass), 0.5, "medium"); // Example values for weight and size
                System.out.println("Item classified as: " + item);
                return item;
            } catch (Exception e) {
                System.out.println("Error creating item instance: " + e.getMessage());
                return null;
            }
        } else {
            System.out.println("Item not recognized.");
            return null;
        }
    }

    // Method to create a receipt basis for an item
    public double createReceiptBasis(DepositItem item) {
        if (item != null) {
            double value = itemValues.get(item.getClass());
            System.out.println("Item value added to receipt: $" + value);
            return value;
        } else {
            System.out.println("Item not recognized, no value added.");
            return 0.0;
        }
    }

    // Method to print the final receipt
    public void printReceipt(DepositItem item) {
        if (item != null) {
            String itemName = item.getClass().getSimpleName();
            double value = createReceiptBasis(item);
            ReceiptPrinter printer = new ReceiptPrinter();
            printer.print(itemName, value);
        }
    }
}
