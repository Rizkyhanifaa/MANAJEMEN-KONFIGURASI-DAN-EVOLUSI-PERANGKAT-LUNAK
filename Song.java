package Assignment;

// Enum untuk genre lagu
enum Genre {
    UNDEFINED, POP, ROCK, HIPHOP, RNB, JAZZ, INSTRUMENTALS, CLOWNCORE
}

class Album {
    private String name;

    public Album(String name) {
        this.name = name;
    }

    public void printInfo() {
        if (name != null && !name.isEmpty()) {
            System.out.println("Album Title: " + name);
        }
    }
}

class Artist {
    private String name;
    private String alias;

    public Artist(String name, String alias) {
        this.name = name;
        this.alias = alias;
    }

    public void printInfo() {
        if (name != null && !name.isEmpty()) {
            System.out.println("Artist Name: " + name);
        }
        if (alias != null && !alias.isEmpty()) {
            System.out.println("Artist Also Known As: " + alias);
        }
    }
}

// Class utama Song
public class Song {
    private String id;
    private String title;
    private String releaseYear;
    private String musicFileURL;
    private Genre genre;
    private Album album;
    private Artist artist;

    public Song(String id, String title, String releaseYear, String musicFileURL) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.musicFileURL = musicFileURL;
        this.genre = Genre.UNDEFINED;
    }

    public void setAlbum(String name) {
        this.album = new Album(name);
    }

    public void setArtist(String name, String alias) {
        this.artist = new Artist(name, alias);
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    private void printBasicInfo() {
        System.out.println("Song Title: " + title);
        System.out.println("Release Year: " + releaseYear);
        if (genre != Genre.UNDEFINED) {
            System.out.println("Genre: " + genre);
        }
    }

    public void printInfo(int detailLevel) {
        printBasicInfo();
        if (detailLevel >= 1 && artist != null) {
            artist.printInfo();
        }
        if (detailLevel >= 2 && album != null) {
            album.printInfo();
        }
    }
}
