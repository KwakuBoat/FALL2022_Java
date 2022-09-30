package main.java;

import main.java.gideon_boateng.shapes2d.Rectangle;
import main.java.gideon_boateng.shapes2d.Square;

public class main { //polymorphism = "many shapes"; a given objects exact
                    // characteristics may be delayed until runtime.
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,3);
        Square s1 = new Square(5);

        System.out.println("r1's area is: \t" + r1.getArea());
        System.out.println("s1's area is: \t" + s1.getArea());
    }
}
