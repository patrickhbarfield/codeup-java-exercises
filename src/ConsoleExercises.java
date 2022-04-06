import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        //next is 1.  nextln is a sentence

/* 1. Prompt a user to enter a integer and store that value in an int
    variable using the nextInt method.
    What happens if you input something that is not an integer? ans: u get an err

     double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f",pi);

2. Prompt a user to enter 3 words, and store each of them in a separate variable.
Then, display them back in the console, each on a newline.

    What happens if you enter less than 3 words? didn't give the option
    What happens if you enter more than 3 words? didn't give the option

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 words: ");
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();
        System.out.printf("%s%n %s%n %s%n", word1,word2,word3);


   3. Prompt a user to enter a sentence, then store that sentence in a
String variable using the next method. Then, display that sentence back to the user.
    do you capture all the words? ans: not at first, had to use nextLine.*/
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a frickin' number: ");
        int userInput = scanner.nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.printf("%s", sentence);*/



      /*  Prompt the user to enter values of length and width of a classroom at Codeup
      (or your room if virtual). Use the nextLine method each time you need to get user input.
      In this case, we need it twice, once to get the user input for the length and again to
      get the user input for the width. Parse the resulting strings to a numeric type.

        Assume that the rooms are perfect rectangles.
                Assume that the user will enter valid numeric data for length and width.*/

        Scanner scanner = new Scanner(System.in);
        int userLength = Integer.parseInt(scanner.nextLine());
        int userWidth = Integer.parseInt(scanner.nextLine());
        System.out.println("Classroom length: " + (2 * userLength) + (2 * userWidth));





        /*        String sentence = scanner.nextLine();*/


        /*       int.nextInt;*/

/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the person you like");
        String person = scanner.nextLine();
        System.out.println("Enter what you like about the person");
        String quality = scanner.nextLine();
        System.out.println("Enter what you like doing with person");
        String doWithMe = scanner.nextLine();
        System.out.printf("Hi %s,! I like your %s. Do you want to %s, soon?", person, quality,doWithMe);*/

 /*       System.out.printf("Welcome to %s, %s! I've lived here %d years", city, state,years);
        System.out.printf("Hi %s, %s! I find you very %s quality", person, quality, doWithMe);*/

    }
}
