/*
package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        Input input2 = new Input();
        Input input3 = new Input();
        input.yesNo();
        input2.getInt(7,11);
        input3.getDouble(.1,10);

    }
}

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter a string: "));
        System.out.println(input.getDouble(5.5, 10.5999));
    }

}

//how Ry would no it.

private static scanner scanner = new Scanner(System.in;
//it's final, it's static, it maes the class too.
//it's still priavet to the class of input, but it's ....enables you not
//to have a constructor, and don' thave to create instances...

//then he made all the methods static.
)

//circle
public Circle(double radius)
public double getArea()
public double getCircumference()

// constructor that takes in the radios

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius=radius;
    }

    // create method to make/get circle
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }
    public double getCircumference() {
        return (2 * Math.PI) * this.radius;
    }

    //now go make a java class Circel
    import util.Input;

    public class CircleApp {
        public static void main(String[] args) {
            double userRadius = Input.getDouble("Enter the radius of your circel: ");

            Circle circle = new Circle(userRadius);

            System.out.println(circle.getArea());
            System.out.println(circle.getCircumference());

            continueRunning = Input.yesNo("Would you like to enter antoher circle?(y/n)");
        } while (continueRunning);
    }
}
// leave all input jobs to input, and circle jobs to circle


// classes are blueprints of objects we create.
//here is an object based on the circle class.  has those properties and methods.
//all entities and apps will be represented by objects.

// how does the input work*/
