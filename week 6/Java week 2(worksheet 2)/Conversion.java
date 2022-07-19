class Conversion{
    public static final double MILETOKILOMETER = 1.609;
    public static final double KILOMETERTOMIILE = 0.621;

    public  void mileToKilometer(int a){
        double b = a * MILETOKILOMETER;
        System.out.println("The " + a + " miles contains " + b + " kilometeres.");
    }

    public void kilometereToMiile(int a){
        double b = a * KILOMETERTOMIILE;
        System.out.println("The " + a + " kilometeres contains " + b + " miles.");
    }
    
    public static void main(String[] args) {
        Conversion c = new Conversion();
        c.mileToKilometer(17);
        c.kilometereToMiile(23);
    }
}