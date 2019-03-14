package com.gwd.demokwejk.model;

public class Gif {



    private String name;
    private String username;
    private Boolean favorite;
    private Integer categoryId;

    public Gif(String name, String username, Boolean favorite, Integer categoryId) {
        this.name = name;
        this.username = username;
        this.favorite = favorite;
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
