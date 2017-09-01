package test;

class Movie {

    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("\n\n ----Проигрывание фильма----");
    }
}

public class MovieTestDrive {

    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как Прогореть на Акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        one.playIt();
        System.out.println("Denumirea: "+one.title+"\n Genul Filmului: "+one.genre+"\n Ratingul: "+one.rating );
        
        
        Movie two = new Movie();
        two.title = "Потерянные в Офисе";
        two.genre = "Комедия";
        two.rating = 5;
                two.playIt();
 System.out.println("Denumirea: "+two.title+"\n Genul Filmului: "+two.genre+"\n Ratingul: "+two.rating );
                
        Movie three = new Movie();
        three.title = "Байт-Клуб";
        three.genre = "Трагедия, но в целом веселая";
        three.rating = 127;
        three.playIt();
 System.out.println("Denumirea: "+three.title+"\n Genul Filmului: "+three.genre+"\n Ratingul: "+three.rating );
    }

}
