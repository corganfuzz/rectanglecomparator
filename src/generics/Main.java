package generics;

import java.util.*;

public class Main {

    static class Rectangle {

        double length, width;

        public Rectangle(double length, double width) {
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

        List<Rectangle> rectanglesList = new ArrayList<>();

        Rectangle rect1 = new Rectangle(7.0, 9.0);
        Rectangle rect2 = new Rectangle(10.0, 24.2);
        Rectangle rect3 = new Rectangle(4.2, 5.5);
        Rectangle rect4 = new Rectangle(1.2, 3.2);
        Rectangle rect5 = new Rectangle(23.5, 2.5);
        Rectangle rect6 = new Rectangle(33.5, 2.7);
        Rectangle rect7 = new Rectangle(3.5, 3.5);
        Rectangle rect8 = new Rectangle(6.5, 6.5);
        Rectangle rect9 = new Rectangle(2.5, 1.5);
        Rectangle rect10 = new Rectangle(4.5, 0.5);


        rectanglesList.add(rect1);
        rectanglesList.add(rect2);
        rectanglesList.add(rect3);
        rectanglesList.add(rect4);
        rectanglesList.add(rect5);
        rectanglesList.add(rect6);
        rectanglesList.add(rect7);
        rectanglesList.add(rect8);
        rectanglesList.add(rect9);
        rectanglesList.add(rect10);

        return rectanglesList;
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
