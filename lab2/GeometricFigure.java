public abstract class GeometricFigure {

    protected String color;
    protected static int figureCount = 0;
    
    public GeometricFigure(String color_name) {
        color = color_name;
        figureCount ++;
    }

    public GeometricFigure(){
        this("black");
    }

    public static int showFigureCount(){
        return figureCount;
    }

    public abstract double area();

    public abstract double volume();

    public String getColor(){
        return color;
    }

    public void setColor(String value){
        color = value;
    }
}