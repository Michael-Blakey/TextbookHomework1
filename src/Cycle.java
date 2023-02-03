/**
 * @class: Cycle
 * @author: Michael Blakey
 * @course: ITEC2148 - 05, Spring 2023
 * @version: 1.0
 * @date: February 2, 2023
 *
 *
 *
 */



public class Cycle {
    public static void main (String[]args){
        int number_of_bicycles = 10;
        int number_of_wheels_total = 47;
        int wheels_on_bicycles = 2;
        int wheels_on_tricycles = 3;
        int bicycles_in_shop = number_of_bicycles * wheels_on_bicycles;
        System.out.println("Bikes in the shop:" + bicycles_in_shop);
        System.out.println("47 - 20:" + (number_of_wheels_total - bicycles_in_shop));
        //27 is the number given after subtracting 47 to 20.
        System.out.println("tricycles in the shop:" + 27 / wheels_on_tricycles);
// 27 is how many wheels are left in the shop after bike wheels. So i divided the wheels of trics to 27 ro get my total.


    }
}
