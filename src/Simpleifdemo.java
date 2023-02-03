public class Simpleifdemo {
    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = in.nextInt(); //this will make the user input an integer
        // and retrieve it.

        if(number % 5 == 0){
            System.out.println("HiFive");
        }

        if(number % 2 == 0){
            System.out.print("HiEven");
        }
    }
}

