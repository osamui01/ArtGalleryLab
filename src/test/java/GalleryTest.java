import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {


    Gallery gallery;
    Artwork monaLisa;
    Artwork salvatorMundi;
    Artwork theLastSupper;
    Artist leonardo;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("Anchiano Gallery", 20000);
        monaLisa = new Artwork("Mona Lisa", "Da Vinci", 1000);
        salvatorMundi = new Artwork("Salvator Mundi", "Da Vinci", 2000);
        theLastSupper = new Artwork("The Last Supper", "Da Vinci",3000);
        leonardo = new Artist("Leonardo");
        gallery.addArtwork(monaLisa);
        gallery.addArtwork(salvatorMundi);
        gallery.addArtwork(theLastSupper);
    }

    @Test
    public void hasName(){
        assertThat(gallery.getName()).isEqualTo("Anchiano Gallery");
    }

    @Test
    public void canSetName(){
        gallery.setName("London Gallery");
        assertThat(gallery.getName()).isEqualTo("London Gallery");
    }


    @Test
    public void canGetTill(){
        assertThat(gallery.getTill()).isEqualTo(20000);
    }

    @Test
    public void canSetTill(){
        gallery.setTill(15000);
        assertThat(gallery.getTill()).isEqualTo(15000);
    }

    @Test
    public void canGetArtworks(){
        assertThat(gallery.stock()).isEqualTo(3);
    }

    @Test
    public void hasStock(){
//        gallery.removeArtwork(monaLisa);
//        gallery.removeArtwork(salvatorMundi);
//        gallery.removeArtwork(theLastSupper);

//        When removes are added, we expect the test to fail
        assertThat(gallery.stock()).isGreaterThanOrEqualTo(1);
    }



}
