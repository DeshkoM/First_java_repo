import javax.lang.model.element.UnknownAnnotationValueException;

public class Thrapezoid {
    private final int baseA;
    private final int baseB;
    private final int sizeC;
    private final int sizeD;


    public Thrapezoid(int baseA, int baseB, int sizeC, int sizeD){
        this.baseA = baseA;
        this.baseB = baseB;
        this.sizeC = sizeC;
        this.sizeD = sizeD;
    }
    double h (){
          double result = Math.sqrt(Math.pow(sizeC,2) - Math.pow(((Math.pow((baseB-baseA),2) + Math.pow(sizeC,2)-
                   Math.pow(sizeD,2))/2*(baseB-baseA)),2));
          return result;
    }
    Boolean isThrapezoid (){
        return (baseA!=baseB && baseA > 0 && baseB != 0 && h() != 0.0 && !Double.isNaN(h()));
    }

    void perimeterThrapezoid () {
        if(!isThrapezoid()){
            return;
        }
        if (isThrapezoid()){
            int perimThrapezoid = baseA+baseB+sizeC+sizeD;
            System.out.println("Периметр трапеции = " + perimThrapezoid);
        }
    }

    void areaThrapezoid (){
        if(!isThrapezoid()){
            return;
        }
        if (isThrapezoid()){
            double areaThrapezoid = ((baseA+baseB)*h())/2;
            System.out.println("Площадь трапеции  = " + areaThrapezoid);
        }
    }

    void msg(){
        if(!isThrapezoid()){
            System.out.println("Трапеции не существует");
        }
        if (isThrapezoid()){
            System.out.println("Была создана трапеция с основаниями A = " + baseA + " B = " + baseB +
                    " и с боковыми сторонами C = " + sizeC + " и D = " + sizeD);
        }
    }
}
