package first_java.ua;

import java.util.Objects;

public class Thrapezoid implements java.io.Serializable {
    private int baseA;
    private int baseB;
    private int sizeC;
    private int sizeD;

    public Thrapezoid(){}

    public Thrapezoid(int baseA, int baseB, int sizeC, int sizeD){
        this.baseA = baseA;
        this.baseB = baseB;
        this.sizeC = sizeC;
        this.sizeD = sizeD;
    }

    public int getBaseA() {
        return baseA;
    }

    public void setBaseA(int baseA) {
        this.baseA = baseA;
    }

    public int getBaseB() {
        return baseB;
    }

    public void setBaseB(int baseB) {
        this.baseB = baseB;
    }

    public int getSizeC() {
        return sizeC;
    }

    public void setSizeC(int sizeC) {
        this.sizeC = sizeC;
    }

    public int getSizeD() {
        return sizeD;
    }

    public void setSizeD(int sizeD) {
        this.sizeD = sizeD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thrapezoid that = (Thrapezoid) o;
        return baseA == that.baseA && baseB == that.baseB && sizeC == that.sizeC && sizeD == that.sizeD;
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseA, baseB, sizeC, sizeD);
    }

    @Override
    public String toString() {
        return "Thrapezoid{" +
                "baseA=" + baseA +
                ", baseB=" + baseB +
                ", sizeC=" + sizeC +
                ", sizeD=" + sizeD +
                '}';
    }
}
