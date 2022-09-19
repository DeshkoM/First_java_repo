package first_java.ua;

import java.util.Objects;

public class Circle implements java.io.Serializable {    //Сериализация , требование 1 JavaBeans
    private int radius;

    public int getRadius() { //приватные переменные и публичные get и set для них, требование 3 JavaBeans
        return radius;
    }

    public void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }
    //Пустой конструктор , требование 2 JavaBeans
    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return
                "Circle{" +
                "radius=" + radius +
                '}';
    }
}

