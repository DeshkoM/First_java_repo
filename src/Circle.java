public class Circle {
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }

    Boolean isCircle(){
        return (radius > 0);
    }
    void perimeterCircle(){
        if(!isCircle()){
            return;
        }
        if(isCircle()){
            double perim = 2 * Math.PI * radius;
            System.out.println("Периметр круга = " + perim);
        }
    }
    void areaCircle(){
        if(!isCircle()){
            return;
        }
        if(isCircle()){
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("Площадь круга = " + area);
        }
    }

    void msg(){
        if(!isCircle()){
            System.out.println("Круг на существует");
        }
        if(isCircle()){
            System.out.println("Создан круг с радиусом = " + radius);
        }
    }
}


