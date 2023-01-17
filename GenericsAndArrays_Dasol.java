package Q_LE2;

import java.util.*;

public class GenericsAndArrays_Dasol {
    public static void main(String args[]) {
        //calling my header
        myHeader(2);

        //ArrayList type Integer for the year of studies of the student leaders
        ArrayList<Integer> yearOfStudies = new ArrayList<>(Arrays.asList(2, 3, 4, 3, 2, 2));
        //ArrayList type String for the names of the student leaders
        ArrayList<String> nameArray = new ArrayList<>(Arrays.asList("Harry", "Lavender", "Ron", "Hermione", "Luna", "Vincent"));
        //Note: yearOfStudies and nameArray should correspond to each other

        //creating an array of Pair type reference variable
        Pair[] array = new Pair[yearOfStudies.size()];      //can use either because ArrayList sizes are the same

        //populating the Pair "array" by key and corresponding value using .get() method
        //creating an array that has yearOfStudies and nameArray as a pair
        for (int i = 0; i < array.length; i++) {
            array[i] = new Pair(yearOfStudies.get(i), nameArray.get(i));
        }

        //prompting the user to enter an academic year
        Scanner scan = new Scanner(System.in);
        //scanner input reference variable
        int year =0;
        //reference variable for terminating the code
        char terminate = 'n';

        //infinite loop terminating or continue using the system
        while(true){
            System.out.print("Enter Academic Year (2, 3 or 4): ");
            //infinite loop for exception
            while (true) {
                try {
                    //converting String value inputs as int
                    //year = Integer.parseInt(scan.next());
                    year = scan.nextInt();
                    //checking integer value inputs
//                    while(true){
//                        if(year>4 || year<2) {
//                            System.out.print("Incorrect input! Enter Academic Year (2, 3 or 4): ");//prompt for invalid entry
//                        }break;     //breaking to go back to exception loop
//                    }
                } catch (Exception ex) {        //catching the exception for non-integer inputs
                    System.out.print("Incorrect input! Enter Academic Year (2, 3 or 4): ");
                    //setting year as 0 since input is invalid
                    year = 0;
                    //clearing the buffer
                    scan.nextLine();
                }
                //breaking the while loop if Scanner input is 2, 3, or 4
                if (year <= 4 && year >= 2) {
                    break;
                }

            }

            //conditional statements for which year and how many leader output
            if (year == 2){
                System.out.printf("Found 3 leader(s) from year %d. \n", year);
            } else if (year == 3){
                System.out.printf("Found 2 leader(s) from year %d. \n", year);
            } else {
                System.out.printf("Found 1 leader from year %d. \n", year);
            }

        System.out.print("Here is the list:\n[");
        //for loop for populating the corresponding array at key index and the value
        for (int j = 0; j < array.length; j++) {

            //outputting the value that equals the year and array pair index
            if (year == (int) array[j].getKey()) {
                System.out.printf("%s, ", array[j].getValue());
            }
        }
        System.out.println("\b\b]");        //double /b to remove the comma and white space for output
        System.out.print("Do you wish to continue? (Press y to continue or any other key to terminate:) ");
        terminate = scan.next().charAt(0);//takes the input

        //conditional statement of continuing for breaking out of the while loop
        if(terminate != 'y') {
            break;
        }

    }
        //the footer method for good-bye output
        myFooter(2);

    }
    //This is myHeader method containing my name and student number
    public static void myHeader(int labNum){
        System.out.println("=====================================================");
        System.out.printf("Lab Exercise %d-Q1 \n", labNum);
        System.out.println("Prepared By: Dasol Lim");
        System.out.println("Student Number: 251224110");
        System.out.println("Goal of this Exercise: Checking the code-execution time!");
        System.out.println("=====================================================");
    }
    //This is myFooter containing a good-bye message
    public static void myFooter(int labNum) {
        System.out.println("=====================================================");
        System.out.printf("Completion of Lab Exercise %d-Q1 is successful! \n", labNum);
        System.out.println("Signing off - Dasol Lim");
        System.out.println("=====================================================");
    }
}
