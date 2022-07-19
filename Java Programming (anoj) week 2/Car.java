public class Car {
        public int carCost;
        public int milePerYear;
        public int petrolCostInGallon;
        public int efficiency;
        public int time;
        public int total;
        public int petrolCostIn5Year;
    public Car() {
        carCost = 4600000;
        milePerYear = 15000;
        petrolCostInGallon = 586;
        efficiency = 25;
        time = 5;
        petrolCostIn5Year = (milePerYear*time)*(petrolCostInGallon*efficiency/100);
    }
    public double total(){
        return carCost+petrolCostIn5Year;
    }
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(" Totle cost in 5 year is"+(car.total()));

    }
}
