package com.dcc.movie_api.data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.net.URL;

@Entity
public class Movie {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String genre;
    private String director;
    private URL image;

    public Movie() {
    }

    public Movie(Integer id, String name, String genre, String director, URL image) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.director = director;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public URL getImage() {
        return image;
    }

    public void setImage(URL image) {
        this.image = image;
    }
}
