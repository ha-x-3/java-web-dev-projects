package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("LaunchCode's Best Hits", 200, "mp3", "CD-R");
        DVD myDVD = new DVD("LaunchCode's Blooper Reel", 15, "wav", "DVD-RW");
        // TODO: Call each CD and DVD method to verify that they work as expected.

        myDVD.throwDisc();
        myCD.throwDisc();

        myCD.laser();
    }
}