package main.java.gideon_boateng.shapes2d;

import main.java.gideon_boateng.CurvedDist;

/**
 * Circular cannot be instantiated
 */

public abstract class Circular implements CurvedDist {

    /**
     * radius is to be inheritedd
     */

    protected double radius;

    /**
     * abstract method for 2d area of circular items. MUST BE OVERRIDDEN IN SUBCLASS
     * @return
     */

    public abstract double getArea();

    public double getCircumference(){
        return PI_CONST*radius;
    }
}
