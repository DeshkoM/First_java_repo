package first_java.ua;

public class SquareService{

    public SquareService(){

    }

    public int getPerimeter(Square square) {
        int perimSquare = square.getSizeA() * 4;
        return perimSquare;
    }

    public int getArea(Square square){
            int areaSquare = square.getSizeA()*2;
            return areaSquare;
            }
}
