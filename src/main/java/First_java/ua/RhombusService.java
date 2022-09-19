package First_java.ua;

public class RhombusService extends Rhombus {
    public RhombusService() {
    }

    public RhombusService(int sizeA, int angelA) {
        super(sizeA, angelA);
    }

    public int perimeterRhombus () {
        int perimRhombus = getSizeA() * 4 ;
        return perimRhombus;
        }
    public double sinAngelA (){
        return Math.sin(getAngelA() * Math.PI /180);
    }

    public double areaRhombus(){
            double sinA = sinAngelA();
            double h = getSizeA() * sinA;
            double areaRhombus = h * getSizeA();
            return areaRhombus;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Sin angelA = " + sinAngelA() + '\n' +
                "Rhombus Perimeter = " + perimeterRhombus() + '\n' +
                "Rhombus Area = " + areaRhombus();
    }
}

