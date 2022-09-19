package first_java.ua;

public class RhombusService{
    public RhombusService() {
    }
    public int getPerimeter (Rhombus rhombus) {
        int perimRhombus = rhombus.getSizeA() * 4 ;
        return perimRhombus;
        }
    public double sinAngelA (Rhombus rhombus){
        return Math.sin(rhombus.getAngelA() * Math.PI /180);
    }

    public double getArea(Rhombus rhombus){
            double sinA = sinAngelA(rhombus);
            double h = rhombus.getSizeA() * sinA;
            double areaRhombus = h * rhombus.getSizeA();
            return areaRhombus;
    }

}

