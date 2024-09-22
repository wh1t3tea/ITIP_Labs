public class Sphere extends GeometricFigure {

    protected  final double pi = 3.14;
    protected  double radius;
    protected  double diameter;

    public Sphere(double radiusValue, String colorName) {
        super(colorName);
        radius = radiusValue;
        diameter = radiusValue * 2;
    }

    public Sphere(){
        this(1, "black");
    }

    @Override
    public double area(){
        return 4 * pi * (double) Math.pow(radius, 2);
    }

    @Override
    public double volume(){
        return 4 / 3 * pi * Math.pow(radius, 3);
    }

    public void setRadius(double value){
        radius = value;
        diameter = value * 2;
    }

    public double getRadius(){
        return radius;
    }

    public void setDiameter(double value){
        diameter = value;
        radius = value / 2;
    }

    public double getDiameter(){
        return diameter;
    }

    public void showDiameter() {
        System.out.println("Sphere's diameter equals" + diameter);
    }
} 