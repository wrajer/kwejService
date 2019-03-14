package com.gwd.demokwejk.data;

import com.gwd.demokwejk.model.Gif;
import org.springframework.stereotype.Component;

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
            new Gif("ben-and-mike", "user5", true, 1) );

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }


}
