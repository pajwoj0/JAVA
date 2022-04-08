package Figures;

import Figures.View.View;
import geometricEntities.Triangle.Triangle;
import geometricEntities.Quadrangle.Quadrangle;

public class Main {
    static Triangle[] triangleArray = new Triangle[25];
    static Quadrangle[] quadrangleArray = new Quadrangle[25];
    static View view;

    public static void main(String[] args) {
        view = new View();

        view.setQuadrangleArray(quadrangleArray);
        view.setTriangleArray(triangleArray);

        Triangle.fillArray(triangleArray);
        Quadrangle.fillArray(quadrangleArray);

        view.menu();
    }
}
