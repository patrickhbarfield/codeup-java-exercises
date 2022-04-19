/*
import java.util.Scanner;

//1. Create 4 methods add, subtract, divide, and mult. and a modulus.
public class MethodsExercises {
    public static void main(String[] args) {
*/
/*
        getInteger(1, 10);
        getFactorial();
*//*

        getDice();
*/
/*        int num1, num2, result;
        num1 = 5;
        num2 = 6;
        System.out.println("add 2 numbers: " +

                addNums(num1, num2));
        System.out.println("subtract 2 numbers: " +

                subtractNums(num1, num2));
        System.out.println("multiply 2 numbers: " +

                multiplyNums(num1, num2));
        System.out.println("divide 2 numbers: " +

                divideNums(num1, num2));
        System.out.println("get remainder of 2 divided numbers" +

                modulusNums(num1, num2));*//*

    }

    public static int addNums(int a, int b) {
        return a + b;
    }

    public static int subtractNums(int a, int b) {
        return a - b;
    }

    public static int multiplyNums(int a, int b) {
        return a * b;
    }
//  you can do recursion to validate the input in the case of dividing by zero.
}

    public static int divideNums(double a, double b) {
        return a / b;
    }

    public static int modulusNums(int a, int b) {
        return a % b;
    }

    public static int multiplyByAdd(int x, int y) {

        int sum = 0;
        for (int i = 1; i <= y; i++) {
            sum += x;
        }
        return sum;

        //BONUS: now with recursion (for math) When thinking of recursion, think of how to stop,
        //and how to proceed.  The first time through, it evals to 0 and will return 0.  You cam't
        //multiply by zero, so it's always 0.  If either of them starts off at 0, it returns 0.

        //HOW TO STOP
        if (x == 0 || y == 0) {
            return 0;
        }
        //HOW TO PROCEED
        return (x + multiplyByAdd(x, y:y -1));

        public static i nt getInteger(int min, int max) {
            System.out.println("Enter an integer between " + min + " and " + max + ":");
            int userInput = sc.nextInt();
            if (userInput < min || )
        }

        // Create a method that validates that user input is in a certain range
//
        public static void getInteger ( int min, int max){
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Enter a number between %d and %d: \n", min, max);
            int userInput = scanner.nextInt();
            if (userInput < max && userInput > min) {
                System.out.printf("%d is between %d and %d \n", userInput, min, max);
                System.out.println(getFactorialString(userInput) + getFactorial(userInput));
            } else if (userInput > max || userInput < min) {
                getInteger(min, max);
            }
        }

        public static int getFactorial ( int n){
            if (n == 0)
                return 1;
            else
                return (n * getFactorial(n - 1));
        }

        public static String getFactorialString ( int n){
            String factorialString = n + "! = ";
            String operator = " x ";
            for (int i = 1; i <= n; i++) {
                if (i == n) {
                    operator = " = ";
                }
                factorialString += i + operator;
            }
            return factorialString;
        }
        //separate the userContinue process in a separate method (function) to separate
        public

        //4. Dice roll
//enter # of side for a pair of dice
//int, long, string, float, byte, short, double, char, boolean
        public static void getDice () {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("enter the sides of a dice to roll: ");
            int userInput = scanner.nextInt();
            System.out.println("your first dice is: " + getRandomNumber(userInput));
            System.out.println("your second dice is: " + getRandomNumber(userInput));
            System.out.println("Do you want to roll again? (Y/N)");


        }

        //must define the type of input like in functions
        public static int getRandomNumber ( int getSidesOfDice){
            return (int) Math.floor(Math.random() * getSidesOfDice + 1);
        }
    }

*/
/*            int i,fact=1;
            int number=4;//It is the number to calculate factorial
            fact = getFactorial(number);

  System.out.println("Factorial of "+number+" is: "+fact);*//*


//must encapsulate/defined everything in a class.
//in java you  must declare what a method returns.
//field: a class member of the class
//java has access modifiers, tells you where you can see the method.  public means another class can access it.
//strongly typed, means everything you declare inside of Java, you must assign it to that type.
//in java you have to declare a return statement is void.
// if you need several different versions of the same method, you can use overloading.  and they will take in
// different parameters.*/
