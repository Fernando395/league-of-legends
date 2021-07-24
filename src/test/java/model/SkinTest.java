package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SkinTest {
    Skin skin = new Skin("default", "18/01/2011", 0, true);

    @Test
    public void shouldGetName() {
        assertEquals("default", skin.getName());
    }

    @Test
    public void shouldGetReleaseDateOf() {
        assertEquals("18/01/2011", skin.getReleaseDateOf());
    }

    @Test
    public void shouldGetObtainable() {
        assertTrue(skin.getObtainable());
    }

    @Test
    public void shouldGetStorePrice() {
        assertEquals(0, skin.getStorePrice());
    }
}
