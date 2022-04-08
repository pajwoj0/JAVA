package Figures.View;

import geometricEntities.Point.Point;
import geometricEntities.Quadrangle.Quadrangle;
import geometricEntities.Triangle.Triangle;

public interface IView {
    public void setTriangleArray(Triangle[] triangleArray);
    public void setQuadrangleArray(Quadrangle[] quadrangleArray);
    public void menu();
}
