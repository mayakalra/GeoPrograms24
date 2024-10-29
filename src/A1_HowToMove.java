public class A1_HowToMove extends World { // class = program
// this is a comment for notes
    public void go() { // method has parentheses

        System.out.println("This message will be printed to the window below.");
        plane.pausetime = 2; // variable (no parentheses, has equal signs) moves pixel
        plane.startingAngle(90); // method (has parentheses)
        plane.isTrail = true; // variable
        plane.move(200); // method
        plane.isTrail = false; // variable
        plane.move(100); // method
        plane.isTrail = true; // variable
        plane.move(200); // method

    }

}
// end of program/end of class

// no code here