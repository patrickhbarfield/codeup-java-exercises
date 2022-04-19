
//creating a new class.
public class Person {
    //writing main method on the class (person) that creates a new object

    private String name;
    //we only have one to set.

    public Person(String name) {
        this.name = name;
    }

// have to make the constructors.  public person this.name = name.
// constructor would be the name of the class

    //since we didn't write a constructor java creates a default.  that's why we use a setter

    // custom methods are behaviors that every object has in the program
// in java you can encapsulate behavior or a specific
//class.  binding data and behaviors together based on specific subj obj.
    public String getName() {
        return this.name;

//TODO: return the person's name
    }

    public void setName(String name) {
//TODO: change the name field to the passed value

        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello from," + this.name);
    }

}

    //must make the constructor outside of the method. constructor creates a new object.

    // getName is an accessor method/getter. gives access to private properties
    //getter will always be void.
    /*
// have to specify a name since you set it.
public static void main(String[]args){
        Person person=new Person("Ry");

        //test
        System.out.println(person.getName());

        //lets reset the name.  We changed the state of the object and gave it a name.
        person.setName("Casey");
        sout-person.getName());
//anytime the name of a property changes you have to use the getter to get the current state.

//testing the custom method
        //should print out 'Say hello Casey'
        person.sayHello();
        }
        }

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        //you can do this to use "prompt" with anything anytime.
        //this is called a dynamic prompt.
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println(prompt);
        String userInput = this.scanner.next();
        if (userInput.equlsIgnoreCase("y"))
             ||userInput.equalsIgnoreCase("yes")){
            return true;
        } else{
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.println("enter an integer between " + min + " and " + max + ";");
        int userInput = this.scanner.nextInt();
        if (userInput < min || userInput > max) {
            return getIn(min, max);
        } else {
            return userInput;
        }
// in math you can take in one set of integers and one that takes in doubles.
        public int getInt () {

        }
    }
    //we know when we call a constructor we are calling an instance of tha tclass.
    //it's teeling you don't instantiate the scanner until you have created a new input

}

*/
