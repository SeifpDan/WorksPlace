package test;

/**
 *
 * @author dan.sarbei
 */
public class DrumKit {

    boolean topHat = true;
    boolean snare = true;

    void playSnare() {

        System.out.println("snarePlay");

    }

    void playTopHat() {

        System.out.println(" tophat");
    }

}

class DrumKitTestDrive {

    public static void main(String[] args) {

        DrumKit d = new DrumKit();
        d.playSnare();
        d.playTopHat();
        d.snare = false;

        if (d.snare == true) {

            d.playSnare();

        }
    }

}
