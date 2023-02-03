/**
 * @class: Findx
 * @author: Michael Blakey
 * @course: ITEC2148 - 05, Spring 2023
 * @version: 1.0
 * @date: February 2, 2023
 *
 */



public class Findx {
    public static void main(String[]args){
        int a = 5;
        int b = 19;
        int x;  //Variable that needs to be found
        int c = 47;
        int sum = 194;
        int added_numbers_we_have = a + b + c;
        //Number needed to subtract from the sum to get the variable X.
        x = a + b + c - sum;
        System.out.println("X = " + (sum - added_numbers_we_have ));




    }
}
