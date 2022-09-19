package First_java.ua;

import java.util.Objects;

class Triangle implements java.io.Serializable{
    private int sizeA;
    private int sizeB;
    private int sizeC;
    //конструкторы
    public Triangle(){

    }

    public Triangle(int sizeA, int sizeB, int sizeC){
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
    }
    //геттеры и сеттеры
    public int getSizeA(){
        return sizeA;
    }

    public void setSizeA (int sizeA){
    this.sizeA = sizeA;
    }

    public int getSizeB() {
        return sizeB;
    }

    public void setSizeB(int sizeB) {
        this.sizeB = sizeB;
    }

    public int getSizeC(){
        return sizeC;
    }

    public void setSizeC(int sizeC){
        this.sizeC = sizeC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return sizeA == triangle.sizeA && sizeB == triangle.sizeB && sizeC == triangle.sizeC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeA, sizeB, sizeC);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sizeA = " + sizeA +
                ", sizeB = " + sizeB +
                ", sizeC = " + sizeC +
                '}';
    }
}
