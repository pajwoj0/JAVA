package geometricEntities.Quadrangle;

import geometricEntities.Point.Point;
import geometricEntities.Triangle.Triangle;

import java.util.Arrays;

public class Quadrangle implements IQuadrangle {
    Point a;
    Point b;
    Point c;
    Point d;



    public Quadrangle(Point a, Point b, Point c, Point d) { //constructor
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Quadrangle() { //constructor without default values
        this.a = new Point();
        this.b = new Point();
        this.c = new Point();
        this.d = new Point();
    }



    @Override
    public double getPerimeter() {
        double dist1 = a.getDistance(b);
        double dist2 = b.getDistance(c);
        double dist3 = c.getDistance(d);
        double dist4 = d.getDistance(a);

        return dist1 + dist2 + dist3 + dist4;
    }

    @Override
    public double getArea() {
        double area = 0;
        double[] xArray = new double[4];
        double[] yArray = new double[4];

        xArray[0] = a.getX();
        yArray[0] = a.getY();

        xArray[1] = b.getX();
        yArray[1] = b.getY();

        xArray[2] = c.getX();
        yArray[2] = c.getY();

        xArray[3] = d.getX();
        yArray[3] = d.getY();

        int j = 3;
        for(int i=0; i<4; i++) {
            area += (xArray[j] + xArray[i]) * (yArray[j] - yArray[i]);
            j = i;
        }

        return Math.abs(area/2);
    }

    @Override
    public double getDiagonalAC() {
        double diagonal = a.getDistance(c);
        return diagonal;
    }

    @Override
    public double getDiagonalBD() {
        double diagonal = b.getDistance(d);
        return diagonal;
    }



    @Override
    public Point getA() {
        return a;
    }

    @Override
    public Point getB() {
        return b;
    }

    @Override
    public Point getC() {
        return c;
    }

    @Override
    public Point getD() {
        return d;
    }



    @Override
    public void changeA(Point a) {
        this.a = a;
    }

    @Override
    public void changeB(Point b) {
        this.b = b;
    }

    @Override
    public void changeC(Point c) {
        this.c = c;
    }

    @Override
    public void changeD(Point d) {
        this.d = d;
    }



    @Override
    public void changeA(double x, double y) {
        a.setPoint(x, y);
    }

    @Override
    public void changeB(double x, double y) {
        b.setPoint(x, y);
    }

    @Override
    public void changeC(double x, double y) {
        c.setPoint(x, y);
    }

    @Override
    public void changeD(double x, double y) {
        d.setPoint(x, y);
    }



    @Override
    public String toString() {
        String p1 = a.toString();
        String p2 = b.toString();
        String p3 = c.toString();
        String p4 = d.toString();

        String q = String.format("A" + p1 + ", B" + p2 + ", C" + p3 + ", D" + p4);
        return q;
    }

    @Override
    public void printData() {
        System.out.println(toString());
        System.out.println("Obwod: "+getPerimeter());
        System.out.println("Przekatna AC: "+getDiagonalAC());
        System.out.println("Przekatna BD: "+getDiagonalBD());
        System.out.println("Pole: "+getArea()+"\n");
    }

    public static Quadrangle random() {
        Point p1 = Point.random(-5, 0, -5, 0);
        Point p2 = Point.random(0, 5, -5, 0);
        Point p3 = Point.random(0, 5, 0, 5);
        Point p4 = Point.random(-5, 0, 0, 5);

        Quadrangle randomQuadrangle = new Quadrangle(p1, p2, p3, p4);

        return randomQuadrangle;
    }

    public static void printAllData(Quadrangle[] array) {
        int arrayLength = array.length;
        for(int i=0; i<arrayLength; i++) array[i].printData();
    }

    public static Quadrangle[] fillArray(Quadrangle[] array) {
        int length = array.length;
        for(int i=0; i<length; i++) array[i] = Quadrangle.random();

        return array;
    }

    public static void sortArray(Quadrangle[] array) {
        int arrayLength = array.length;
        Quadrangle temp;
        double[] areaArray = new double[arrayLength];

        for(int i=0; i<arrayLength; i++) areaArray[i] = array[i].getArea();
        Arrays.sort(areaArray);

        for(int i=0; i<arrayLength; i++) {
            for(int j=0; j<arrayLength; j++) {
                if(areaArray[i] == array[j].getArea()) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
