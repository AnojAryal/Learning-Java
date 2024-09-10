public class CustomerPanel {
    
    public void itemReceived(Integer slot) {
        System.out.println("Item received in slot: " + slot);
    }

    public void printReceipt() {
        System.out.println("Receipt printed.");
    }
}