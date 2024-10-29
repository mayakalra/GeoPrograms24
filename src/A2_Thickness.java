public class A2_Thickness extends World {

    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("A2 Thickness");
        plane.pausetime = 0;

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10; // thickness
        plane.move(100);
        plane.trailWidth = 2;
        plane.move(100);
        plane.trailWidth = 50;
        plane.move(100);

    }

}