package geometricEntities.Point;

import java.util.Random;

public class Point implements IPoint {
    double x;
    double y;



    public Point(double x, double y) { //constructor
        this.x = x;
        this.y = y;
    }

    public Point() { x=0; y=0; } //constructor, default values (0, 0)



    @Override
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }



    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }



    @Override
    public Point getPoint() {
        Point p = null;
        p.setPoint(x, y);
        return p;
    }

    @Override
    public double getDistance(Point b) {

        double x1 = this.x;
        double x2 = b.getX();

        double y1 = this.y;
        double y2 = b.getY();

        return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
    }



    @Override
    public String toString() {
        double x = this.x;
        double y = this.y;

        String p = String.format("(%f; %f)", x, y);
        return p;
    }

    @Override
    public void printData() {
        System.out.println(toString());
    }

    public static Point random(double fromX, double toX, double fromY, double toY) {
        Random rand = new Random();
        Point p = new Point();

        double randomValueX = fromX + (toX - fromX) * rand.nextDouble();
        double randomValueY = fromY + (toY - fromY) * rand.nextDouble();

        p.setPoint(randomValueX, randomValueY);
        return p;
    }

    public static Point random(double from, double to) {
        Random rand = new Random();
        Point p = new Point();

        double randomValueX = from + (to - from) * rand.nextDouble();
        double randomValueY = from + (to - from) * rand.nextDouble();

        p.setPoint(randomValueX, randomValueY);
        return p;
    }
}
