/**
 * Description: Application that creates two objects:
 * Square and Circle which are created with different values
 * Returns the areas of each object
 * Example Square created with side length 2 and circle with radius 1
 * 
 * @author Marti Lonnemann
 * @version 0.1
 *          CS131LAB0_1_MEL
 *          Spring-2023
 */

public class Application {
    public static void main(String[] args) throws Exception {
        Square sq = new Square(2);
        Circle cir = new Circle(1);
        System.out.println("Area of Square of side length " + sq.getSide() + ": " + sq.area());
        System.out.println("Area of Circle of radius " + cir.getRadius() + ": " + cir.getRadius());
    }
}
