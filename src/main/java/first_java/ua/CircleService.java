package first_java.ua;

public class CircleService{

    public CircleService (){
    }

    public double getPerimeter(Circle circle) {
        double perim = 2 * Math.PI * circle.getRadius();
        return perim;
    }

    public double getArea(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        return area;
    }
}
