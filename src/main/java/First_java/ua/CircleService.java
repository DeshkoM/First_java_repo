package First_java.ua;

public class CircleService extends Circle {

    public CircleService (){
    }
    public CircleService(int radius) {
        super(radius);
    }

    public double  perimeterCircle() {
        double perim = 2 * Math.PI * getRadius();
        return perim;
    }

    public double areaCircle() {
        double area = Math.PI * Math.pow(getRadius(), 2);
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Circle Perimetr = " +
                perimeterCircle() + '\n' +
                "Circle Area = " +
                areaCircle();
    }
}
