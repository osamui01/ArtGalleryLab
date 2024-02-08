import java.util.ArrayList;

public class Gallery {

    private String name;
    private float till;
    private ArrayList<Artwork> artworks;

    public Gallery (String galleryName, float galleryTill) {
        this.name = galleryName;
        this.till = galleryTill;
        this.artworks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTill() {
        return till;
    }

    public void setTill(float till) {
        this.till = till;
    }

    public ArrayList<Artwork> getArtworks() {
        return artworks;
    }

    public void setArtworks(ArrayList<Artwork> artworks) {
        this.artworks = artworks;
    }

    public void addArtwork (Artwork artwork) {
        this.artworks.add(artwork);
    }

    public void removeArtwork (Artwork artwork) {
        this.artworks.remove(artwork);
    }

    public  int stock(){
        return this.artworks.size();
    }


}
