public class Rhombus {
    private int sizeA;
    private int sizeB;
    private int sizeC;
    private int sizeD;

    private int angelA;

    public Rhombus(int sizeA, int sizeB, int sizeC, int sizeD, int angelA){
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;
        this.sizeD = sizeD;
        this.angelA = angelA;
    }

    Boolean isRhombus (){
        return (sizeA==sizeB && sizeA==sizeC && sizeA==sizeD && angelA!=0
                && angelA !=90 && angelA>0 && angelA<180 && sizeA > 0);
    }

    void perimeterRhombus () {
        if(!isRhombus()){
            return;
        }
        if (isRhombus()){
            int perimRhombus = sizeA+sizeB+sizeC+sizeD;
            System.out.println("Периметр ромба = " + perimRhombus);
        }
    }
    double sinAngelA (){
        return Math.sin(angelA * Math.PI /180);
    }

   void areaRhombus(){
        if(!isRhombus()){
            return;
        }
        if(isRhombus()){
            double sinA = sinAngelA();
            double h = sizeA * sinA;
            double areaRhombus = h * sizeA;
            System.out.print("Cинус угла " + angelA + " = " + sinA + " :: ");
            System.out.println("Высота h = " + h);
            System.out.print("Площадь ромба равна = " + sinA  + " * " + h + " = "+ areaRhombus);
        }
    }

    void msg(){
        if(!isRhombus()){
            System.out.println("Ромба не существует");
        }
        if (isRhombus()){
            System.out.println("Был создан ромб со сторонами = " + sizeA + " и углом А = " + angelA);
        }
    }

}