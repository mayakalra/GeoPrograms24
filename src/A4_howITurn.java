public class A4_howITurn extends World {

    public void go() {

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0); // red, green, blue
        plane.move(100);
        house();
    }
    public void house() {

        plane.turn(90);
        plane.setColor(200, 100, 0);
        plane.move(100);

        plane.turn(90);
        plane.setColor(100,50,4);
        plane.move(100);

        plane.turn(90);
        plane.setColor(150,3,9);
        plane.move(100);

        plane.teleport(700,500);
        plane.turn(60);
        plane.setColor(45,30,70);
        plane.move(100);
        
        plane.trailWidth = 20;
        plane.turn(180);
        plane.move(100);
        plane.turn(-120);
        plane.move(100);
        /////
        plane.turn(-120);
        plane.setColor(200, 100, 0);
        plane.move(100);

        plane.turn(90);
        plane.setColor(100,50,4);
        plane.move(100);

        plane.turn(90);
        plane.setColor(150,10,50);
        plane.move(100);

        plane.turn(90);
        plane.setColor(70,10,46);
        plane.move(100);
    }


}
