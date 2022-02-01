package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        CD cd = new CD();
        DVD dvd = new DVD();

        cd.playAudio();
        cd.spin();
        cd.write("123");
        cd.read();

        dvd.playVideo();
        dvd.spin();
        dvd.write("123");
        dvd.read();
    }
}
