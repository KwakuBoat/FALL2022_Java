package main.java.gideon_boateng.shapes2d;

public class Rectangle extends Parallelogram{

    public Rectangle(double l, double w){
        width=w;
        length=l;
    }
    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
