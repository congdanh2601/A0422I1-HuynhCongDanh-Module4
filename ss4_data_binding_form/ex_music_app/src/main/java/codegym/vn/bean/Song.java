package codegym.vn.bean;

public class Song {
    private String name;
    private String singer;
    private String genre;
    private String path;

    public Song() {
    }

    public Song(String name, String singer, String genre, String path) {
        this.name = name;
        this.singer = singer;
        this.genre = genre;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}