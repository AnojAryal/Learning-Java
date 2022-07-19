public class Display{

	int number;
    int sq;

	public Display(){
		number = 5;
	}

	public int  square() {
        return (int) Math.pow(number, 2);
	}
    public int  cube() {
        return (int) Math.pow(number, 3);
	}
    public int  forthPower() {
        return (int) Math.pow(number, 4);
	}
    

	public static void main(String[] args) {
		Display d = new Display();
        
        System.out.println("square = "+d.square());
        System.out.println("cube = "+d.cube());
        System.out.println("Fourth Power = "+d.forthPower());
	}
}
