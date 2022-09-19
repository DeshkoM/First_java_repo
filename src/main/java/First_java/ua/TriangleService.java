package First_java.ua;

public class TriangleService extends Triangle {

    public TriangleService(){

    }
    public TriangleService(int sizeA, int sizeB, int sizeC){
        super(sizeA,sizeB,sizeC);
    }


    public int perimeterTriangle(){
        int perim_Triangle = getSizeA() + getSizeB() + getSizeC();
        return perim_Triangle;
    }
    public double areaTriangle(){
            double semiPerim = (getSizeA() + getSizeB() + getSizeC())/2.0;
            double formula = (semiPerim*(semiPerim-getSizeA())*(semiPerim-getSizeB())*(semiPerim-getSizeC()));
            double area_Triangle = Math.sqrt(formula);
            return area_Triangle;
        }

    @Override
    public String toString() {
        return super.toString()+'\n'+
                "Triangle Perimeter = " + perimeterTriangle() + '\n'+
                "Triangle Area = " + areaTriangle();
    }
}
