/**
 * A rectangle with a width and a height.
 */
public class Rectangle {
private double width;
private double height;

    /**
     * Creates a rectangle with the given width and height.
     *
     * @param w the width of the rectangle
     * @param h the height of the rectangle
     */
public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
}

    /**
     * Returns the area of this rectangle.
     *
     * @return the width times the height
     */
public double area() {
        return width * height;
}

    /**
     * Scales the rectangle.
     *
     * @param factor the amount to multiply the width and height by
     */
public void scale(double factor) {
        width = width * factor;
        height = height * factor;
}

    /**
     * Returns whether this rectangle has a larger area than other.
     *
     * @param other the rectangle to compare with
     * @return true if this rectangle's area is larger than other's area
     */
public boolean isLargerThan(Rectangle other) {
        if (area() > other.area()) {
            return true;
        } else {
            return false;
        }
}
}