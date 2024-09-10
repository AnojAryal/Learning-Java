import java.util.ArrayList;
import java.util.List;

public class ReceiptBasis {

    private final List<DepositItem> items;
    private final ReceiptPrinter receiptPrinter;

    public ReceiptBasis(ReceiptPrinter receiptPrinter) {
        this.items = new ArrayList<>();
        this.receiptPrinter = receiptPrinter;
    }

    public void addItem(DepositItem item) {
        items.add(item);
        System.out.println("Item deposited in machine: " + item);
    }

    public void computeSum() {
        double total = items.stream()
                            .mapToDouble(DepositItem::getValue)
                            .sum();
        System.out.println("Total sum: $" + total);
    }

    public void printFinalReceipt() {
        computeSum();
        System.out.println("------ Final Receipt ------");
        for (DepositItem item : items) {
            receiptPrinter.print(item.toString(), item.getValue());
        }
        System.out.println("---------------------------");
    }
}
