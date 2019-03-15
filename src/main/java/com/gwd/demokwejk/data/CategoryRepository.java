package com.gwd.demokwejk.data;

import com.gwd.demokwejk.model.Category;
import com.gwd.demokwejk.model.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component//komponent nam tworzy beana, tworzy nam obiek który bedzie można wstrzyknac w nnej klasie
public class CategoryRepository {

    public static final List<Category> ALL_CATEGORIES = Arrays.asList(new Category(1, "funny"),
            new Category(2, "sport"), new Category(3, "it"));


    public static List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public static Category getById(int id) {

        return ALL_CATEGORIES.get(id-1);
    }


}
