public class EX3 {
    public static void main(String[] args) {
        System.out.println(perimetroRettangolo(10, 2.5));
        System.out.println(evenOdd(5));
        System.out.println(areaTriangolo(2.5, 4.2, 5.6));

    }

    public static double perimetroRettangolo(double l1, double l2) {
        return l1 + l2 + l1 + l2;
    }

    public static int evenOdd(int myNumber) {
        return myNumber % 2 == 0 ? 0 : 1;
    }

    public static double areaTriangolo(double l1, double l2, double l3) {
        double semiPerimeter = (l1 + l2 + l3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - l1) * (semiPerimeter - l2) * (semiPerimeter - l3));
    }
}
