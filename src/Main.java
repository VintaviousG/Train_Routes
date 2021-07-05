/*


* */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // import java.util.Scanner

    public static void main(String[] args) {

        //Getting the user input
        Scanner user = new Scanner(System.in); // Create a Scanner object

        System.out.println("Welcome Passenger, please enter the two stations");

        //User Inputs for stations
        String userChoice1 = user.next();
        String userChoice2 = user.next();

        //Route 1
        ArrayList<String> Route_1 = new ArrayList<String>(9);
        Route_1.add("140");
        Route_1.add("134");
        Route_1.add("Unicentro");
        Route_1.add("100");
        Route_1.add("30");
        Route_1.add("R");
        Route_1.add("Marsella");
        Route_1.add("Mu");
        Route_1.add("Bosa");


        //Route 2
        ArrayList<String> Route_2 = new ArrayList<String>(6); //Auto cap at 10
        Route_2.add("Germania");
        Route_2.add("19");
        Route_2.add("Sabana");
        Route_2.add("R");
        Route_2.add("Espec");
        Route_2.add("F");

        //Route 3
        ArrayList<String> Route_3 = new ArrayList<String>(5);
        Route_3.add("Gu");
        Route_3.add("Santiago");
        Route_3.add("SENA");
        Route_3.add("Mu");
        Route_3.add("Timiza");

/*
*
We are checking the user input to make sure the stations enter in any of the ArrayList Routes. If so, we will return that specific Route.
* */
        if (Route_1.contains(userChoice1) && Route_1.contains(userChoice2)) {
            System.out.println("These will be on Route 1, which traverse between the stations of: " + Route_1);
        } else if (Route_2.contains(userChoice1) & Route_2.contains(userChoice2)) {
            System.out.println("These will be on Route 2, which traverse between the stations of: " + Route_2);
        } else if (Route_3.contains(userChoice1) && Route_3.contains(userChoice2)) {
            System.out.println("These will be on Route 3, which traverse between the stations of: " + Route_3);
        }

        System.out.println("Thanks and have a nice day");


    }

}
