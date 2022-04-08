package geometricEntities.Triangle;

import geometricEntities.Point.Point;

public interface ITriangle {
    public double getPerimeter();
    public double getArea();
    public double getHeight(Point p);
    public double getHeight(double x, double y);

    public Point getA();
    public Point getB();
    public Point getC();

    public void changeA(Point a);
    public void changeB(Point b);
    public void changeC(Point c);

    public void changeA(double x, double y);
    public void changeB(double x, double y);
    public void changeC(double x, double y);

    public String toString();
    public void printData();
}
