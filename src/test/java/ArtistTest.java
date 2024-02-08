import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist davinci;

    @BeforeEach
    public void setUp(){
        davinci = new Artist("Da Vinci");
    }

    @Test
    public void hasName(){
        assertThat(davinci.getName()).isEqualTo("Da Vinci");
    }



}
