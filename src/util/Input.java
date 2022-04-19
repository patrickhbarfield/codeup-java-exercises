/*
package util;

import java.util.Scanner;

public class Input {
    //create priavet field named scanner (takes new input from user)
    private Scanner scanner;

    //create new constructor
    public Input() {
        //this tells you everytime you run input create a new scanner
        this.scanner = new Scanner(System.in);
    }

    //psvm


 */
/*   public static void main(String[] args) {
        Input input = new Input();
        Input input2 = new Input();
        Input input3 = new Input();
        input.yesNo();
        input2.getInt(7,11);
        input3.getDouble(.1,10);

    }*//*


    //methods go here
    // nextLine
    public String getString() {
        return this.scanner.nextLine();
    }

    // set this to a new string so you can run this once and check input.
    public Boolean yesNo() {
        String input = getString();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.println("Give me a number between " + min + " and " + max);
        int input = getInt();
        if (input > min && input < max) {
            System.out.println(input + " is between " + min + " and " + max);
            return input;
        } else {
            return getInt(min, max);
        }
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("Give me a number between " + min + " and " + max);
        double input = getDouble();
        if (input > min && input < max) {
            System.out.println(input + " is between " + min + " and " + max);
            return input;
        } else {
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }
}
*/
/*public class util {
    //create a name input that has a private field named scanner.
    Person person = new Person();
}
// the scanner is going to be a property/field of the input class.

*//*
*/
/*public class*//*
*/
/*

private Scanner scanner;
//use a constructor to create a new private object
public Input () {
    this.scanner = new Scanner(System.in);
        }*//*

// use that scanner property for the rest of the methods below
//OOP and Java uses it's own set of vocab.*/
