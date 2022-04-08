package geometricEntities.Point;

public interface IPoint {
    public void setPoint(double x, double y);

    public double getX();
    public double getY();

    public Point getPoint();
    public double getDistance(Point b);

    public String toString();
    public void printData();
}
