package com.gwd.demokwejk.data;

import com.gwd.demokwejk.model.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component//komponent nam tworzy beana, tworzy nam obiek który bedzie można wstrzyknac w nnej klasie
public class GifRepository {

    //dla każdego repozytorium będzie dostepna taka lista
    public static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "user1", true, 1),
            new Gif("infinite-andrew", "user1", true, 2),
            new Gif("cowboy-coder", "user2", false, 1),
            new Gif("compiler-bot", "user3", true, 3),
            new Gif("book-dominos", "user4", false, 2),
            new Gif("ben-and-mike", "user5", true, 1));

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public static List<Gif> getFavoritesGifs() {

        List<Gif> favoritesGifs = new ArrayList<>();

        for (Gif g : ALL_GIFS) {
            if (g.getFavorite() == true) {
                favoritesGifs.add(g);
            }
        }

        return favoritesGifs;
    }

    public static List<Gif> getGifsById(int id) {

        List<Gif> gifsById = new ArrayList<>();
        for (Gif g : ALL_GIFS) {
            if (g.getCategoryId() == id) {
                gifsById.add(g);
            }
        }
        return gifsById;
    }

    public static List<Gif> getGifsByName(String q) {

        List<Gif> GifsByName = new ArrayList<>();
        for (Gif g : ALL_GIFS) {
            if (g.getName().contains(q)) {
                GifsByName.add(g);
            }
        }
        return GifsByName;
    }

    public static Gif getGifWithName(String q) {


        for (Gif g : ALL_GIFS) {
            if (g.getName().contains(q)) {
                return g;
            }
        }
        return null;
    }

}
