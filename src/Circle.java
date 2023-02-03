/**
 * @class: Circle
 * @author: Michael Blakey
 * @course: ITEC2148 - 05, Spring 2023
 * @version: 1.0
 * @date: February 2, 2023
 *
 *
 */




public class Circle {
    public static void main(String[]args){
        double radius = 9.5; //double is needed due to the number being 9.5.
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;
        System.out.println("Area of the circle is = " + area);
        System.out.println("Perimeter of the circle is = " + perimeter);


    }
}
