/**
 * Class Name: Speedlight
 * Author: Michael Blakey
 * Version: 1.0
 * Course: ITEC 2140 Section 01 Spring 2023
 * Date: 26 January 2023
 */





public class Chocolate {
    public static void main(String[]args){
        int BagsOfChocolate = 9;
        int Chocolate_in_Each_Bag = 2;
        int Bars_to_fill_bags = 3;
        int Chocolate_bars_total = BagsOfChocolate * Chocolate_in_Each_Bag;
        int Number_of_bags_for_three_bars_each = Chocolate_bars_total / Bars_to_fill_bags;
        System.out.println("Bags of Chocolate:" + BagsOfChocolate);
        System.out.println("# of bars in bag:" + Chocolate_in_Each_Bag);
        System.out.println("# of bars to fill bag:" + Bars_to_fill_bags);
        System.out.println("Chocolate bars in total:" + Chocolate_bars_total);
        System.out.println("Bags needed for three bars each:" + Number_of_bags_for_three_bars_each);



    }
}
