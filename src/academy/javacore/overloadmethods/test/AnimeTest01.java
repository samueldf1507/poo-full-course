package academy.javacore.overloadmethods.test;

import academy.javacore.overloadmethods.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Ação");

        anime.printAnimeInformations();



    }
}
