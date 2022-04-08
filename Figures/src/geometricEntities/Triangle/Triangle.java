package geometricEntities.Triangle;

import geometricEntities.Point.Point;

import java.util.Arrays;

public class Triangle implements ITriangle {
    Point a;
    Point b;
    Point c;



    public Triangle (Point a, Point b, Point c) { //constructor
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() { //constructor, default values (0, 0)
        this.a = new Point();
        this.b = new Point();
        this.c = new Point();
    }



    @Override
    public double getPerimeter() {
        double dist1 = a.getDistance(b);
        double dist2 = b.getDistance(c);
        double dist3 = c.getDistance(a);

        return dist1 + dist2 + dist3;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        double area = Math.sqrt(p * (p - a.getDistance(b)) * (p - b.getDistance(c)) * (p - c.getDistance(a)));
        return area;
    }

    @Override
    public double getHeight(Point p) {
        double h;
        double area = getArea();

        if(p.getX()==a.getX() && p.getY()==a.getY()) h = (2 * area) / b.getDistance(c);
        else if(p.getX()==b.getX() && p.getY()==b.getY()) h = (2 * area) / a.getDistance(c);
        else if(p.getX()==c.getX() && p.getY()==c.getY()) h = (2 * area) / b.getDistance(a);

        else {
            System.out.println("Podano bledny wierzcholek, nie ma takiego w tym trojkacie.");
            return -1;
        }

        return h;
    }

    @Override
    public double getHeight(double x, double y) {
        double h;
        Point p = new Point(x, y);

        h = getHeight(p);
        return h;
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
    public String toString() {
        String p1 = a.toString();
        String p2 = b.toString();
        String p3 = c.toString();

        String t = String.format("A" + p1 + ", B" + p2 + ", C" + p3);
        return t;
    }

    @Override
    public void printData() {
        System.out.println(toString());
        System.out.println("Obwod: "+getPerimeter());
        System.out.println("Pole: "+getArea()+"\n");
    }

    public static Triangle random() {
        Point p1 = Point.random(-5, 5);
        Point p2 = Point.random(-5, 5);
        Point p3 = Point.random(-5, 5);

        Triangle randomTriangle = new Triangle(p1, p2, p3);

        return randomTriangle;
    }

    public static void printAllData(Triangle[] array) {
        int arrayLength = array.length;
        for(int i=0; i<arrayLength; i++) array[i].printData();
    }

    public static Triangle[] fillArray(Triangle[] array) {
        int length = array.length;
        for(int i=0; i<length; i++) array[i] = Triangle.random();

        return array;
    }

    public static void sortArray(Triangle[] array) {
        int arrayLength = array.length;
        Triangle temp;
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
