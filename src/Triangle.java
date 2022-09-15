class Triangle {
    private int sizeA;
    private int sizeB;
    private int sizeC;

    public Triangle(int sizeA, int sizeB, int sizeC){
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
    }

    Boolean isTriangle(){
        return (((sizeA + sizeB) > sizeC && (sizeA + sizeC) > sizeB && (sizeB + sizeC) > sizeA));
    }
    void perimeterTriangle(){
        if (!isTriangle()) {
            return;
        }
        if (isTriangle()) {
            int perim_Triangle = sizeA + sizeB + sizeC;
            System.out.println("Периметр треугольника = " + perim_Triangle);
        }
    }
   void areaTriangle(){
       if (!isTriangle()) {
           return;
       }
       if (isTriangle()) {
           double semiPerim = (sizeA + sizeB + sizeC)/2.0;
           double formula = (semiPerim*(semiPerim-sizeA)*(semiPerim-sizeB)*(semiPerim-sizeC));
           double area_Triangle = Math.sqrt(formula);
           System.out.println("Площадь треугольника = " + area_Triangle);
       }
   }
    void msg() {
        if (!isTriangle()){
            System.out.println("Треугольника не существует");
        }
        if (isTriangle()){
            System.out.println("Треугольник создан со сторонами A = " + sizeA + " B = " + sizeB + " C = " + sizeC);
        }
    }
}
