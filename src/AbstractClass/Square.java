package AbstractClass;

public class Square extends GeoFigure {

    private final int NUM_Sides = 4;

    private  double sides;

    public int getNUM_Sides() {
        return NUM_Sides;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    @Override
    public double calArea() {
        double area = Math.pow(sides,2);
        return area;
    }

    @Override
    public double calPerimeter() {
        double perimeter = sides * NUM_Sides;
        return perimeter;
    }
}
