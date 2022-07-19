class Circle{
    public static final double PI = 3.142857 ;
    double radius = 7.5;

    public void circimference(){
        double circumference = 2 * PI * radius;
        System.out.println(circumference);
    }

    public void area(){
        double area = PI * radius * radius;
        System.out.println(area);
    }

    public void volune(){
        double volume = (4 * PI * radius) / 3 ;
        System.out.println(volume);
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.circimference();
        c.area();
        c.volune();
    }        
}