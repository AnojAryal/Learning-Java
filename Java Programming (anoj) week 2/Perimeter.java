public class Perimeter{

	final double PAPER_WIDTH;
	final double PAPER_LENGTH;
	double perimeter;
	double diagonal;

	public Perimeter(){
		PAPER_WIDTH = 8.5;
		PAPER_LENGTH = 11;
	}

	public void  perimeter() {
        
	    perimeter = 2 * PAPER_LENGTH + 2 * PAPER_WIDTH;
        diagonal = Math.sqrt(Math.pow(PAPER_WIDTH, 2) + Math.pow(PAPER_LENGTH, 2));
		
		System.out.printf("Perimeter: %.2f\n", perimeter);
		System.out.printf("Diagonal length: %.2f\n",diagonal);
	}

	public static void main(String[] args) {
		Perimeter d = new Perimeter();
		d.perimeter();
	}
}