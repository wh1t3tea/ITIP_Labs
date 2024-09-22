public class Main {
    public static void main(String[] args){
        Sphere sphere = new Sphere();
        Cylinder cylinder = new Cylinder();
        Parallelepiped parallelepiped = new Parallelepiped();

        System.out.printf("%s %s %s\n", sphere.getColor(), sphere.getRadius(), sphere.getDiameter());
        System.out.printf("%s %s %s\n", cylinder.getColor(), cylinder.getRadius(), cylinder.getHeight(), cylinder.getCylinderType());
        System.out.printf("%s %s %s\n", parallelepiped.getColor(), parallelepiped.getHeight(), parallelepiped.getWidth(), parallelepiped.getDepth());

        System.out.println("Number of created figures: " + GeometricFigure.showFigureCount());



        sphere.area();
        sphere.volume();
        cylinder.area();
        cylinder.volume();
        parallelepiped.area();
        parallelepiped.volume();

    
        Sphere newSphere = new Sphere(2, "white");
        Cylinder newCylinder = new Cylinder(2, 1, "green", "elliptical");
        Parallelepiped newParallelepiped = new Parallelepiped(2, 4, 3, "brown");


        System.out.printf("%s %s %s\n", newSphere.getColor(), newSphere.getRadius(), newSphere.getDiameter());
        System.out.printf("%s %s %s %s\n", newCylinder.getColor(), newCylinder.getRadius(), newCylinder.getHeight(), newCylinder.getCylinderType());
        System.out.printf("%s %s %s %s\n", newParallelepiped.getColor(), newParallelepiped.getHeight(), newParallelepiped.getWidth(), newParallelepiped.getDepth());

        System.out.println("Number of created figures: " + GeometricFigure.showFigureCount());

        newSphere.setColor("blue");
        newSphere.setRadius(2);
        newCylinder.setColor("orange");
        newCylinder.setRadius(3);
        newCylinder.setHeight(5);
        newCylinder.setCylinderType("elliptical");
        newParallelepiped.setColor("grey");
        newParallelepiped.setHeight(5);
        newParallelepiped.setWidth(6);
        newParallelepiped.setDepth(5);

        System.out.printf("%s %s %s\n", newSphere.getColor(), newSphere.getRadius(), newSphere.getDiameter());
        System.out.printf("%s %s %s %s\n", newCylinder.getColor(), newCylinder.getRadius(), newCylinder.getHeight(), newCylinder.getCylinderType());
        System.out.printf("%s %s %s %s\n", newParallelepiped.getColor(), newParallelepiped.getHeight(), newParallelepiped.getWidth(), newParallelepiped.getDepth());
    }
}
