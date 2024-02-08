import java.util.ArrayList;

public class Artwork {

    private String title;
    private String artist;
    private float price;

    public Artwork (String artworkTitle, String artworkArtist, float artworkPrice) {
        this.title = artworkTitle;
        this.artist = artworkArtist;
        this.price = artworkPrice;
    }

    public String getArtist () {
        return this.artist;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }
}
