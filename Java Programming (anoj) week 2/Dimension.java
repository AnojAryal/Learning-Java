public class Dimension{

	final double MILIMETERS_INCH;
	final double width;
	final double height;
	double milimeters_width;
	double milimeters_height;

	public Dimension(){
		MILIMETERS_INCH = 25.4;
		width = 8.5;
		height = 11;
	}

	public void  dimension() {
        
	    milimeters_width = width * MILIMETERS_INCH;
	    milimeters_height = height * MILIMETERS_INCH;
		
		System.out.println("Dimensions in milimeters: "+ milimeters_width +" , "+ milimeters_height);
	}

	public static void main(String[] args) {
		Dimension d = new Dimension();
		d.dimension();
	}
}