package first_java.ua;

public class ThrapezoidService {
    double h (Thrapezoid thrapezoid){
        double result = Math.sqrt(Math.pow(thrapezoid.getSizeC(),2) - Math.pow(((Math.pow((thrapezoid.getBaseB()
                - thrapezoid.getBaseA()),2) + Math.pow(thrapezoid.getSizeC(), 2)-
                Math.pow(thrapezoid.getSizeD(), 2))/2*(thrapezoid.getBaseB()- thrapezoid.getBaseA())),2));
        return result;
    }

    public int getPerimeter(Thrapezoid thrapezoid) {
            int perimThrapezoid = thrapezoid.getBaseA()+thrapezoid.getBaseB()+
                    thrapezoid.getSizeC()+thrapezoid.getSizeD();
            return perimThrapezoid;
        }

    public double getArea (Thrapezoid thrapezoid){
            double areaThrapezoid = ((thrapezoid.getBaseA()+thrapezoid.getBaseB())*h(thrapezoid))/2;
            return areaThrapezoid;
        }
}
