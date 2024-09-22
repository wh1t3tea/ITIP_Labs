public class Parallelepiped extends GeometricFigure {
    private double width;
    private double height;
    private double depth;

    public Parallelepiped(double widthValue, double heightValue, double depthValue, String colorName){
        super(colorName);
        width = widthValue;
        height = heightValue;
        depth = depthValue;
    }

    public Parallelepiped(){
        this(1, 1, 1, "black");
    }

    @Override
    public double area(){
        return 2 * (width * height + width * depth + height * width);
    }

    @Override
    public double volume(){
        return width * height * depth;
    }

    public void setWidth(double value){
        width = value;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double value){
        height = value;
    }

    public double getHeight(){
        return height;
    }

    public void setDepth(double value){
        depth = value;
    }

    public double getDepth(){
        return depth;
    }

}
