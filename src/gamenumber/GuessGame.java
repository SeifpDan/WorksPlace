package gamenumber;

/**
 *
 * @author dan.sarbei
 */
public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guesspl = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean plisRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Introdu un nr. de la  0...9");

        while (true) {
            System.out.println("Numarul care trebuie ghicit : " + targetNumber);;

            p1.guess();
            p2.guess();
            p3.guess();

            guesspl = p1.number;
            System.out.println(" Varianta primului jucator " + guesspl);

            guessp2 = p2.number;
            System.out.println(" Varianta primului jucator " + guessp2);

            guessp3 = p3.number;
            System.out.println(" Varianta primului jucator " + guessp3);
            System.out.println(" ");

            if (guesspl == targetNumber) {
                plisRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (plisRight || p2isRight || p3isRight) {

                System.out.println("Avem un castigator");
                System.out.println("Primul jucator a ghicit? " + plisRight);
                System.out.println("Al doilea jucator a ghicit? " + p2isRight);
                System.out.println("Al treilea jucator a ghicit? " + p3isRight);
                System.out.println(" Final game. ");
                break;
            } else {

                System.out.println("Mai incercati odata");
            }
        }
    }

}
