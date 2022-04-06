public class SyntaxTypesVariables {

    public static void main(String[] args) {

        // datatypes are essential to writing JAVA because ...
        //methods are java's version of function. You have to say what type it is.  must return one type of value.
        //data types  JS Avariable Declarations
      //  let something = value is javascript, but for java we use data-type.

//    DATATYPE -> NAME = VALUE

        // boundaries, days in a month will never be more than 31
        // keyword final is like const in javascript and can't be changed.
        // use a byte for days of month

 byte myByte = 31;

 short employees = 1000;

 int userID = 1000000;

 long lightYears = Long.MAX_VALUE +1;

 // System.out.println(lightYears);
 //2 decicmal primitive type. float and double
 //must specify this is a float because it auto reads as a double

        float roundedPi = 3.14f;

 //double used for very precise math
        double someBigDecimal = 3.143434343434;

        // char is a primitive type
char yesNo = 'Y';

boolean patLikesMezcal = true;

// all of these have wrapper classes.  meaning you can use them to get info on them.  ex. using long to get maxvalue.  you can also
        //declare them by their wrapper class.

        // how to declare strings in Java

        String someString = "Wither thou?";
        System.out.println(someString);
        String someQuote = "\"Some cliche quote\" - Mark Twain";
        System.out.println(someQuote);

        String backSlash = "I can do a backslash \\. Double backslash \\\\. And.....triple backslash\\\\\\";
        System.out.println(backSlash);

        System.out.println(someQuote + "\n" + someQuote);

        //implicit is getting more precise.
    }
}
