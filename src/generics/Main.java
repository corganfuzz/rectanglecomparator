package generics;

import java.util.*;

public class Main {

    static class Rectangle {

        double length, width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        double calcArea() {
            return length * width;
        }
        double calcPerimeter() {
            return 2 * (length + width);
        }
        public String toString() {
            return Double.toString(this.calcArea());
        }
    }

    static class RectangleAreaComparator implements Comparator<Rectangle> {

        @Override
        public int compare(Rectangle r1, Rectangle r2) {
            double area1 = r1.calcArea();
            double area2 = r2.calcArea();
            return Double.compare(area1, area2);
        }
    }

    static List<Rectangle> ArrayListCreation() {

        return new ArrayList<>(Arrays.asList(
                new Rectangle(7.0, 9.0),
                new Rectangle(10.0, 24.2),
                new Rectangle(4.2, 5.5),
                new Rectangle(1.2, 3.2),
                new Rectangle(23.5, 2.5),
                new Rectangle(33.5, 2.7),
                new Rectangle(3.5, 3.5),
                new Rectangle(6.5, 6.5),
                new Rectangle(2.5, 1.5),
                new Rectangle(4.5, 0.5)
        ));
    }

    static void sortedRectanglesPrinting() {
        List<Rectangle> rectanglesList = ArrayListCreation();

        System.out.println("\nThe unsorted area of rectangles are: ");
        rectanglesList.forEach(name -> System.out.print(name + " "));

        RectangleAreaComparator rectangleComparator = new RectangleAreaComparator();
        rectanglesList.sort(rectangleComparator);

        System.out.println("\n");
        System.out.println("The sorted area of rectangles are: ");
        System.out.println(rectanglesList);
    }

    public static void main(String[] args) {
        sortedRectanglesPrinting();
    }
}
