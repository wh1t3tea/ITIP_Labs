public class Cylinder extends Sphere{
    private double height;
    private String cylinderType;

    public Cylinder(double radiusValue, double heightValue, String colorName, String typeValue){
        super(radiusValue, colorName);
        height = heightValue;
        cylinderType = typeValue;
    }

    public Cylinder(){
        this(1, 1, "black", "elliptical");
    }

    @Override
    public double area(){
        return 2 * pi * (double) Math.pow(radius, 2) + 2 * pi * radius * height;
    }

    @Override
    public double volume(){
        return pi * Math.pow(radius, 2) * height;
    }

    public void showType(){
        System.out.println("Cylinder type is" + cylinderType);
    }

    public void setHeight(double value){
        height = value;
    }

    public double getHeight(){
        return height;
    }

    public void setCylinderType(String value){
        cylinderType = value;
    }

    public String getCylinderType(){
        return cylinderType;
    }

}
