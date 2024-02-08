import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artist artist;
    Artwork monaLisa;
    Artwork salvatorMundi;
    Artwork theLastSupper;

    @BeforeEach
    public void setUp () {
//        artist = new Artist("Da Vinci");
//        gallery = new Gallery();
        monaLisa = new Artwork("Mona Lisa", "Da Vinci", 1000);
        salvatorMundi = new Artwork("Salvator Mundi", "Da Vinci",2000);
        theLastSupper = new Artwork("The Last Supper", "Da Vinci",3000);
//        gallery.addArtwork(monaLisa);
    }

    @Test
    public void hasArtist () {
        assertThat(monaLisa.getArtist()).isEqualTo("Da Vinci");
        assertThat(salvatorMundi.getArtist()).isEqualTo("Da Vinci");
        assertThat(theLastSupper.getArtist()).isEqualTo("Da Vinci");
    }

    @Test
    public void hasTitle () {
        assertThat(monaLisa.getTitle()).isEqualTo("Mona Lisa");
        assertThat(salvatorMundi.getTitle()).isEqualTo("Salvator Mundi");
        assertThat(theLastSupper.getTitle()).isEqualTo("The Last Supper");
    }

    @Test
    public void hasPrice () {
        assertThat(monaLisa.getPrice()).isEqualTo(1000);
        assertThat(salvatorMundi.getPrice()).isEqualTo(2000);
        assertThat(theLastSupper.getPrice()).isEqualTo(3000);
    }

    @Test
    public void canSetPrice () {
        monaLisa.setPrice(1000);
        salvatorMundi.setPrice(1000);
        theLastSupper.setPrice(1000);

        assertThat(monaLisa.getPrice()).isEqualTo(1000);
        assertThat(salvatorMundi.getPrice()).isEqualTo(1000);
        assertThat(theLastSupper.getPrice()).isEqualTo(1000);
    }


}
