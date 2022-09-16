package First_java.ua;

public class Circle implements java.io.Serializable{    //Сериализация , требование 1 JavaBeans
    private int radius;
    public int getRadius(){ //приватные переменные и публичные get и set для них, требование 3 JavaBeans
        return radius;
    }
    public void setRadius(int radius){
        if(radius > 0) {
            this.radius = radius;
        }
    }
    //Пустой конструктор , требование 2 JavaBeans
    public  Circle(){
    }

    public Circle(int radius){
        this.radius = radius;
    }

    public void perimeterCircle(){
            double perim = 2 * Math.PI * radius;
            System.out.println("Периметр круга = " + perim);
    }
    public void areaCircle(){
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("Площадь круга = " + area);
    }
    public void msg(){
            System.out.println("Создан круг с радиусом = " + radius);
    }
}


