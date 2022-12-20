package com.example.song_validation.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "{name.notBlank}")
    @Size(max = 800, message = "{name.maxSize}")
    @Pattern(regexp = "^[\\w\\s]+$", message = "{name.format}")
    private String name;
    @NotBlank(message = "{artist.notBlank}")
    @Size(max = 300, message = "{artist.maxSize}")
    @Pattern(regexp = "^[\\w\\s]+$", message = "{artist.format}")
    private String artist;
    @NotBlank(message = "{genre.notBlank}")
    @Size(max = 1000, message = "{genre.maxSize}")
    @Pattern(regexp = "^[\\w,\\s]+$", message = "{genre.format}")
    private String genre;

    public Song() {
    }

    public Song(int id, String name, String artist, String genre) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
