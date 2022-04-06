import org.w3c.dom.ls.LSOutput;

public class HelloWorld {

    //use a main method to run.  It's an entry point.  It's what runs all the code. main method should be small on only what's necessary.
    //public means this class and method/function are visible to the whole project.  main is a special method.  you can have multiple, but not
    //recommended.
    //Static: Alot of classes will be blueprints for objects.  ex. cat objects.  The class is the blueprint for what each cat looks like.  It would have
        //properties like, age, breed, color. Static can only belong to the whole class, and not to each object.  A good use are utility methods
    //equiv of console log is System.out.println()
    //sout is the shortcut.
    //no single quotes for strings in java.
    //To get the below up. main or psvm TAB
    public static void main (String[] args) {
/*        System.out.println("Hello, World");*/

        // 1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

      //  2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.

String myString = "String my string";
        System.out.println(myString);

       // 3. Change your code to assign a character value to myString. What do you notice?
        // ans: you get an error because they are incompatible types

/*        char myString = 'c';
        System.out.println(myString);*/

        // 4. Change your code to assign the value 3.14159 to myString. What happens?

/*
        float myString = 3.14159f;
        System.out.println(myString);
*/

        // 5. Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
// (error returns incompatible types: void cannot be converted to long
        //get an error because you didn't initialize the variable to something.  You can't use null.  It has to be an object.
        //for a clean slate for a long, make it 0.  ex.
/*        long myNumber = 0;
                System.out.println(myNumber);*/

  // 6. Change your code to assign the value 3.14 to myNumber. What do you notice?
        // (ans: java: incompatible types: possible lossy conversion from double to byte)
        // decimal must be float or double.
/*        byte myNumber = 3.14;
        System.out.println(myNumber);*/

// 7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        //ans (java: incompatible types: possible lossy conversion from long to byte)
/*        float myNumber = 123L;
        System.out.println(myNumber);*/

        // 8. Change your code to assign the value 123 to myNumber.
/*        byte myNumber = 123;
        System.out.println(myNumber);*/

      // 9.  Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        // ans: long is an integer and not a float/decimal

  // 10. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens?
        // What are two ways we could fix this?
        // ans: you get error java: incompatible types: possible lossy conversion from double to float
        // ans: you can change float to double or put "f" at the end. casting ex. myNumber = (float) 3.14;
/*float myNumber = 3.14f;
        System.out.println(myNumber);*/

       // 11. Copy and paste the following code blocks one at a time and execute them
        //What is the difference between the above code blocks? Explain why the code outputs what it does.
        //ans: the first one prints 5,6 and the second 6,6 because the second one pre-increments the number.
/*        int x = 5;
        System.out.println(x++);
        System.out.println(x);*/

/*        int x = 5;
        System.out.println(++x);
        System.out.println(x);*/

// 11. Try to create a variable named class. What happens?
        //ans: you get "not a statement" error because class is a reserved word.
        //object is a generic type, polymorphism means many shapes/many forms.  i.e.-one thing can be many things. it's an umbrella type
/*        String class = "yes";
        System.out.println(class);*/

        // 12.  Object is the most generic type in Java. You can assign any value to a variable of type Object.
        // What do you think will happen when the following code is run?
// ans: no idea.
        //Copy and paste the code above and then run it. Does the result match with your expectation?
        // ans: n/a
        // compile error stops it from running.  Runtime error hits when it gets to it.

/*        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;*/

        //How is the above example different from the code block below?
        // ans: not sure.


    // 13. Rewrite the following expressions using the relevant shorthand assignment operators:

/*        int x = 4;
        x = x + 5;
+=  */
/*        int x = 3;
        int y = 4;
        y = y * x;

        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;*/

      // 14.  What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
      //  ans: you get error: java: incompatible types: possible lossy conversion from int to byte
        // What happens if you increment a numeric variable past the type's capacity?
        //ans: you get the following error: "java: incompatible types: possible lossy conversion from int to byte"
     //  Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

/*byte me = 126 + 2;
        System.out.println(me);*/
                }
}