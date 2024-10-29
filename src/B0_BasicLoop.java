public class B0_BasicLoop extends World {
// loop diagram: for (how many times){ stuff to do } in the parenthesis for ( start, condition, increment)
    // 1. check condition, if condition is true do the stuff. if the condition is false, skip to end of loop
    // 3. increment, repeat
    public void go() {

        plane.isTrail = true;
        plane.trailWidth = 2;
        plane.pausetime = 0;

        for (int x = 0; x < 5; x = x + 1) {
            System.out.println(x);
            plane.square(100);
        }

            plane.pausetime = 0;
        for (int x = 1; x < 30; x = x + 1) {
            System.out.println("circle #" + x);
            plane.setColor(150, 10, 90);
            plane.trailWidth = 10;
            plane.circle(20);
            plane.turn(50);

            plane.teleport(200,600);
            plane.setColor(50, 100, 70);
            plane.trailWidth = 5;
            plane.circle(60);
            plane.turn(120);

            plane.teleport(500,600);
            plane.setColor(80, 10, 20);
            plane.trailWidth = 5;
            plane.turn(90);

            plane.teleport(800,600);
            plane.setColor(70,30,20);
            plane.trailWidth = 30;

            plane.teleport(500,200);
            plane.circle(4);
        }}
    }