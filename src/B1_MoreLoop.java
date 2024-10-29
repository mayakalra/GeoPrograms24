public class B1_MoreLoop extends World {

    public void go() {
        plane.pausetime = 0;
        plane.trailWidth = 5;

        for (int y = 0; y < 800; y = y + 1) {

            for (int x = 0; x < 1000; x = x + 1) {
                plane.teleport(x, y);
//                plane.setColor(110,40,120);
//                square(1);
                plane.setPixelColor(110,x/4,120);
                System.out.println("x: " + x);
            }
        }
//        plane.teleport(300, 300);
//        hexagon(50);
//        plane.teleport(498,263);
//        polygon(100,2);
    }

    public void square(int distance) { // distance is the parameter
        for (int x = 0; x < 4; x=x+1){
            plane.isTrail = true;
            plane.move(distance);
            plane.turn(90);
            System.out.println("x: " + x);
        }
    }
}





// level 4: draw a shape with n number of sides where n is a parameter

