class MeterToKilometers{
    public static final double CONSTANT = 1000000;

    public void conversion(int a){
        double b = a / CONSTANT;
        System.out.println(b ); 
    }

    public static void main(String[] args) {
        MeterToKilometers mtk = new MeterToKilometers();
        mtk.conversion(23);
    }
}