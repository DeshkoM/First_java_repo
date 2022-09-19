package First_java.ua;

import java.util.Objects;

public class Rhombus  extends Square implements java.io.Serializable{

    private int angelA;
    public int getAngelA() {
        return angelA;
    }

    public void setAngelA(int angelA) {
        this.angelA = angelA;
    }

    public Rhombus (){

    }

    public Rhombus (int sizeA, int angelA){
        super(sizeA);
        this.angelA = angelA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rhombus rhombus = (Rhombus) o;
        return angelA == rhombus.angelA ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), angelA);
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "angelA=" + angelA +
                "} " + super.toString();
    }
}