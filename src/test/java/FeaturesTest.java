
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeaturesTest {
    Features features = new Features("lutador", "fácil", "exemplo", "corpo a corpo");

    @Test
    public void shouldGetFunction() {
        assertEquals("lutador", features.getFunction());
    }

    @Test
    public void shouldGetDifficulty() {
        assertEquals("fácil", features.getDifficulty());
    }

    @Test
    public void shouldGetStory() {
        assertEquals("exemplo", features.getStory());
    }

    @Test
    public void shouldGetAttackType() {
        assertEquals("corpo a corpo", features.getAttackType());
    }

}
