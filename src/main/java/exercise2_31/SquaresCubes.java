package roadmapPartTwo.week12_10;

public class SquaresCubes {
    public static void main(String[] args)
    {
        // Initialization of variable
        int num;

        //Determination of square and cube
        System.out.println("number"+"\t"+"square"+"\t"+"cube");
        num = 0;
        System.out.printf("%d \t %d \t %d\n", (num), (num*num), (num*num*num));
        num = 1;
        System.out.printf("%d \t %d \t %d\n", (num), (num*num), (num*num*num));
        num = 2;
        System.out.printf("%d \t %d \t %d\n", (num), (num*num), (num*num*num));
        num = 3;
        System.out.printf("%d \t %d \t %d\n", (num), (num*num), (num*num*num));
        num = 4;
        System.out.printf("%d \t %d \t %d\n", (num), (num*num), (num*num*num));
        num = 5;
        System.out.printf("%d \t %d \t %d\n", (num), (num*num), (num*num*num));
        num = 6;
        System.out.printf("%d \t %d \t %d\n", (num), (num*num), (num*num*num));
        num = 7;
        System.out.printf("%d \t %d \t %d\n", (num), (num*num), (num*num*num));
        num = 8;
        System.out.printf("%d \t %d \t %d\n", (num), (num*num), (num*num*num));
        num = 9;
        System.out.printf("%d \t %d \t %d\n", (num), (num*num), (num*num*num));
        num = 10;
        System.out.printf("%d \t %d \t %d\n", (num), (num*num), (num*num*num));
    }
}

/*
public class Hw231 {
    public static void main(String[] args) {
        System.out.println("number square cube");
        calculateSquareCube(0);
    }
    public static void calculateSquareCube (int x) {
        if (x <= 10) {
            System.out.println(x + "     " + (int) Math.pow(x,2) + "     " + (int) Math.pow(x,3));
            x++;
            calculateSquareCube(x);
        }
    }
}
*/