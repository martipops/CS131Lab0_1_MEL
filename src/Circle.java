/**
 * Circle class:
 * This class uses a radius variable of type int and uses it
 * to return a double of the area of the circle using the area() method.
 */
public class Circle {
    private int radius;

    /**
     * Sets the default radius value to 0
     */
    public Circle() {
        radius = 0;
    }

    /**
     * Creates a circle object with specified radius
     * 
     * @param r the radius to set the circle to
     */
    public Circle(int r) {
        radius = r;
    }

    /**
     * Sets the radius of the circle
     * 
     * @param r the value to set the radius of the circle to
     */
    public void setRadius(int r) {
        radius = r;
    }

    /**
     * Gets the radius of the circle
     * 
     * @return int: the value of the radius of the circle
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Finds the area of the circle using the Math class and formula pi*r^2
     * 
     * @return double: the area of the circle
     */
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}