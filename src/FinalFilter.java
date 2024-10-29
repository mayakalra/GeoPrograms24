public class FinalFilter extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("blueElephant.jpg");
        plane.showBackGround();
        plane.pausetime = 0;

        backgroundGradient();
        elephantFilter();
        flower();
        grass();

        plane.teleport(1000,1000);

    }

    public void flower() {
        //stem of flower
        plane.isTrail = true;
        plane.teleport(103, 539);
        plane.setColor(50, 133, 8);
        plane.trailWidth = 20;
        plane.startingAngle(90);
        plane.move(250);

        //petals of flower
        plane.teleport(111, 539);
        for (int x = 1; x < 8; x = x + 1) {
            plane.setColor(54, 195, 255);
            plane.trailWidth = 5;
            plane.circle(10);
            plane.turn(50);
        }
    }

    public void grass() {
        plane.isTrail = true;
        plane.teleport(0, 730);
        plane.setColor(50, 133, 8);
        plane.trailWidth = 75;
        plane.startingAngle(0);
        plane.move(724);
    }

    public void elephantFilter() {
        for (int row = 0; row < 1000; row++) {
            for (int col = 0; col < 1000; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red < 200 && red > 50 && green < 200 && green > 100 && blue < 250 && blue > 150) {
                    plane.setPixelColor(255, 164, 54);
                } else if (red < 50 && green < 145 && green > 100 && blue < 200 && blue > 125) {
                    plane.setPixelColor(255, 164, 54);
                }
            }
        }
    }

    public void backgroundGradient() {
        for (int row = 0; row < 1000; row++) {
            for (int col = 0; col < 1000; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red<255 && red>240 && green<255 && green>240 && blue<255 && blue>230) {
                      plane.setPixelColor(col / 4, 100, row / 4);
                }
            }
        }
    }
}



