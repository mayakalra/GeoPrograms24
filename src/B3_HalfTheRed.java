public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("PowerPuff.png");
        plane.showBackGround();
        HotPinkFilter();
        powerpuff();

        for (int y = 260; y < 150; y = y + 1) {
            for (int x = 300; x < 530; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();                  // variable = a method
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red <= 30 && green <= 10 && blue <= 20) {
                    plane.setPixelColor(192, 230, 227);
                }
            }
        }

        for (int y = 0; y < 560; y = y + 1) { // rows
            for (int x = 0; x < 1000; x = x + 1) { // columns
                plane.teleport(x, y);

                red = plane.howMuchRed();                  // variable = a method
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(x, 488 - y);
                if (red > 255 && red < 200 && green > 145 && green < 155) {                                   // 196, 152, 242
                    plane.setPixelColor(192, 230, 227);
                } // end of purple cloud

            }
        }
    }

    public void HotPinkFilter() {

        for (int row = 0; row < 1000; row = row + 1) {
            for (int col = 0; col < 1000; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                //plane.teleport(col, 799 - row); //flips picture upside down
                 if (red > 220 && red < 260 && green < 270 && green > 180 && blue > 60 && blue < 200) {
                    plane.setPixelColor(252, 3, 111);
                }
            }

        }
    }

    public void powerpuff () {
         {

            for (int row = 0; row < 1000; row = row + 1) {
                for (int col = 0; col < 1000; col++) {
                    plane.teleport(col, row);

                    red = plane.howMuchRed();
                    green = plane.howMuchGreen();
                    blue = plane.howMuchBlue();
                    //plane.teleport(col, 799 - row); //flips picture upside down
                    if (red > 220 && red < 260 && green < 270 && green > 180 && blue > 60 && blue < 200) {
                        plane.setPixelColor(252, 3, 111);
                }

            }
        }
    }

}
}

