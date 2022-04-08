package geometricEntities.Quadrangle;

import geometricEntities.Point.Point;

public interface IQuadrangle {
    public double getPerimeter();
    public double getArea();
    public double getDiagonalAC();
    public double getDiagonalBD();

    public Point getA();
    public Point getB();
    public Point getC();
    public Point getD();

    public void changeA(Point a);
    public void changeB(Point b);
    public void changeC(Point c);
    public void changeD(Point d);

    public void changeA(double x, double y);
    public void changeB(double x, double y);
    public void changeC(double x, double y);
    public void changeD(double x, double y);

    public String toString();
    public void printData();
}
