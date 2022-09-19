package First_java.ua;

public class SquareService extends Square {

    public SquareService(){

    }

    public SquareService(int sizeA){
        super(sizeA);
    }

    public int perimeterSquare() {
        int perimSquare = getSizeA() * 4;
        return perimSquare;
    }

    public int areaSquare(){
            int areaSquare = getSizeA()*2;
            return areaSquare;
            }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Square Perim = " + perimeterSquare() + '\n' +
                "Square Area = " + areaSquare();
    }
}
