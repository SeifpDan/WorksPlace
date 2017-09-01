package test;

public class fastTest {

    void playDVD(){
        System.out.println("play dvd");
    }
    boolean canRecord = false;

    void recordDVD() {
        System.out.println("record DVD");
    }
}

class DVDPlayerTestDrive {

    public static void main(String[] args) {
       fastTest d = new fastTest();
        d.canRecord = true;
        d.playDVD();
        if (d.canRecord == true) {
            d.recordDVD();
        }

    }
}
