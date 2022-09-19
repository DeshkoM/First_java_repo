package first_java.ua;

public class TriangleService{
    public TriangleService(){}
    public int getPerimeter(Triangle triangle){
        int perim_Triangle = triangle.getSizeA() + triangle.getSizeB() + triangle.getSizeC();
        return perim_Triangle;
    }
    public double getArea(Triangle triangle){
            double semiPerim = (triangle.getSizeA() + triangle.getSizeB() + triangle.getSizeC())/2.0;
            double formula = (semiPerim*(semiPerim-triangle.getSizeA())*(semiPerim-triangle.getSizeB())
                    *(semiPerim-triangle.getSizeC()));
            double area_Triangle = Math.sqrt(formula);
            return area_Triangle;
        }
}
