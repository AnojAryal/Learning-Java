public class MainApplication {

    public static void main(String[] args) {
        DepositItemReceiver receiver = new DepositItemReceiver();
        
        // Simulate depositing items
        DepositItem bottle = new Bottle(1, 0.10, 0.3, "large");
        DepositItem can = new Can(2, 0.05, 0.1, "medium");
        DepositItem crate = new Crate(3, 0.15, 1.5, "large");

        // Classify and print receipts for items
        receiver.printReceipt(bottle);
        receiver.printReceipt(can);
        receiver.printReceipt(crate);
    }
}
