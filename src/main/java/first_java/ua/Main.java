package first_java.ua;

public class Main {
    public static void main(String[] args) {
       Thrapezoid c = new Thrapezoid(4,5,6,6);
       ThrapezoidService service = new ThrapezoidService();
       System.out.println(service.h(c));
       System.out.println(service.getPerimeter(c));
       System.out.println(service.getArea(c));
    }
}