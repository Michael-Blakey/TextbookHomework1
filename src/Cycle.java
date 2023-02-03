public class Cycle {
    public static void main (String[]args){
        int number_of_bicycles = 10;
        int number_of_wheels_total = 47;
        int wheels_on_bicycles = 2;
        int wheels_on_tricycles = 3;
        int bicycles_in_shop = number_of_bicycles * wheels_on_bicycles;
        System.out.println("Bikes in the shop:" + bicycles_in_shop);
        System.out.println("47 - 20:" + (number_of_wheels_total - bicycles_in_shop));
        System.out.println("tricycles in the shop:" + 27 / wheels_on_tricycles);



    }
}
