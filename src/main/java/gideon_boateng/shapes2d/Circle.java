package main.java.gideon_boateng.shapes2d;

public class Circle extends Circular{
    public Circle(double r){
        radius = r;
    }
    @Override
    public double getArea(){
        return PI_CONST*radius*radius;
    }

}
