import org.w3c.dom.ls.LSOutput;

import javax.print.MultiDocPrintService;

import java.util.Scanner;

  /*  Create an integer variable i with a value of 5.
            Create a while loop that runs so long as i is
             less than or equal to 15
            Each loop iteration, output the current value of i,
            then increment i by one.
*/

/*
public class ControlFlowExercises {
    public static void main(String[] args) {
*/

/*        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;*/

/*        int i = 0;
        do {
            System.out.println(i);
            i += 2;
            //i = i + 2;
        } while (i <= 100);*/

/*        int i = 100;
        do {
            System.out.println(i);
            i -= 5;
        } while (i >= -10);*/

/*        int i = 2;
        do {
            System.out.println(i);
            i = (int) Math.pow(i,2);

        } while (i <= 100000);*/

/*        for (int i = 100; i >= -10; i+=5) {
            System.out.println(i);
        }*/
        /*        for (int i = 2L; i <= 100000; i +=i);*/

/*        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }
    }*/

//3. Display a table of powers, prompt user to enter an integer, display a table of squares and cubes from 1-value entered.
        //ask user if they want to continue, assume suer will enter valid data, only continue if the user agrees to.

  /*      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInt = scanner.nextInt();

        System.out.println("Here is your table");

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= userInt; i++) {
            System.out.println("%-6d | %-7d | %-6d%n", i, i * i, i * i * i);
        }
    }
}*/

/*
        for (i =1; i ++ Math.pow(i, 2);
        for (int i = 2; i <= 100000; i ++ Math.pow(i, 3);
        int userInput = scanner.nextInt();
        System.out.println("Classroom length: " + (2 * userLength) + (2 * userWidth));

    }
}*/

// 4. convert number grades to letter grades
   /*     do {
            int userInput = scanner.nextInt();

            if (userInt >= 88) {
                System.out.println("A");
            } else if (userInt >= 80) {
                System.out.println("B");
            } else if (userIn >= 77) {
                System.out.println("C");
            } else {
                System.out.println("Failure");
            }
            String userResponse = scanner.next();
            if (userResponse.equalsIgnoreCase("y")){
                anotherGrade = false;
            }
        } while (anotherGrade);*/



/*        // Do-while loop
        do {

        // Body od do-while loop
        // Print statement
        System.out.println("Hello World");

        // Update expression
        i++;
        }

        // Test expression
        while (i < 6);*/

/*
        int userAccessLevel = 0;
        System.out.println("User is admin");
    } else if(userAccessLevel =1)
    {
        System.out.println("User does not have admin privileges");
    } else

    {
        boolean continueRunningApp = true;
        //the above is called our control variable.

        do {
            System.out.println("User is a visitor");
            System.out.println("Welcome to cool app, what would you like to do?");
            System.out.println("1: See some stuff");
            System.out.println("2: Do some stuff");
            System.out.println("3: Exit");

            //choose a do-while if you want it to make a choice at least once.  We are going to keep runing it until they decide to exit (choice 3)
            // the boolean controls whether or not to come back up to the top.  i.e.-user response 1, back up to top.

            int userResponse = scanner.nextInt();
            switch (userResponse) {
                case 1:
                    System.out.println("You are seeing some stuff");
                    break;
                //must break so we don't have 'fallthrough"
                case 2:
                    System.out.println("Do some stuff here");
                    break;
                case 3:
                    System.out.println("Goodbye");
                    continueRunningApp = false;
                    break;
                default:
                    System.out.println("That's not an option");
                    System.out.println("Make a valid choice");
            }
        } while (continueRunningApp);

        System.out.println("Exiting Loop");


        // auto transaction on a crypto accoutn w/out him doing it.
        //must be 0 credits in the transaction field, and at least $5 in his wallet in order to keep going.
        //to start loop, must have 0 credits.  To continue, must have > 5 dollars in the wallet

        int inTransaction = 0;
        int walletBalance = 150;
        int transactionAmount = 10;

        //transaction must be zero. only need to check it once

        if (inTransaction == 0) {
            //continue loop while wallet bal is >5 (check until condition is false)
            while (walletBalance > 5) {
                System.out.println("Making transaction");
                System.out.println("Wallet balance before transaction: " + walletBalance);
                walletBalance -= transactionAmount;
                System.out.println("Wallet balance post transaction: " + walletBalance);
            }
// looping
            for(int i - 0; i < 10; i++) {
                System.out.println(i);
                if (i == 5) {

                }
            }
        }*/

//continue, takes goodle sheet for attendence, makes it a .csv, read it and do somethign with those value.  Since
// every spreadsheet is different, Ry used continue to parse everything to a date if it didin'jt have it.

// while loop, while this condition is true, check this body.  a do while runs before, has to execute at least once.
// in the case of the menu, must be displayed and the user makes at least one choice.
//

//highlighted whole piece of code, option command t, choice to surround the whole block in a do while loop

// swithc statemetns; amost the same but you can't pass T or F.  You can pass value syou want to compare.
// this is great in Java for (contacts manager) like make a sleection on the muenu and something happens.
// menu seletions are a gerat use case for switch

/*    }

}*/
// we need booleans for if statements.
//can't pass a boolean to a switch case, but ultimately it compares to 2 booleans
// booleans are compbinations of values tha twill ultimately result in t or f

//char is a primitive type so you can use double equals.
