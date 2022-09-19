package First_java.ua;

import java.util.Objects;

public class Square implements java.io.Serializable {
    private int sizeA;

    public int getSizeA (){
        return sizeA;
    }

    public void setSizeA (int sizeA){
        this.sizeA = sizeA;
    }

    public Square(){

    }

    public Square(int sizeA){
        this.sizeA = sizeA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return sizeA == square.sizeA;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeA);
    }

    @Override
    public String toString() {
        return "Square{" +
                "sizeA = " + sizeA +
                '}';
    }
}
