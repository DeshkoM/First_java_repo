public class Square {
    private int sizeA;
    private int sizeB;
    private int sizeC;
    private int sizeD;

    private int angelA;

    public Square(int sizeA, int sizeB, int sizeC, int sizeD, int angelA){
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
        this.sizeD = sizeD;
        this.angelA = angelA;
    }

    Boolean isSquare (){
        return (sizeA==sizeB && sizeA == sizeC && sizeA==sizeD && angelA == 90
                && sizeA > 0);
    }

    void perimeterSquare () {
        if(!isSquare()){
            return;
        }
        if (isSquare()){
            int perimSquare = sizeA+sizeB+sizeC+sizeD;
            System.out.println("Периметр квадрата = " + perimSquare);
        }
    }

    void areaSquare(){
        if(!isSquare()){
            return;
        }
        if(isSquare()){
            int areaSquare = sizeA*sizeA;
            System.out.println("Площадь квадрата  = " + areaSquare);
        }
    }

    void msg(){
        if(!isSquare()){
            System.out.println("Квадрата не существует");
        }
        if (isSquare()){
            System.out.println("Был создан квадрат со сторонами = " + sizeA);
        }
    }
}
