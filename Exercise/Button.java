//Exercise 1 

public class Button {
    private final String label;

    public Button(String label) {
        this.label = label;
    }

    public void click() {
        System.out.println("Button '" + label + "' clicked!");
        performAction();
    }

    private void performAction() {
        System.out.println("Action performed for '" + label + "'");
    }

    public static void main(String[] args) {
        Button button = new Button("Submit");
        button.click();
    }
}
