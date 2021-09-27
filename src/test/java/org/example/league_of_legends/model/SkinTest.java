package org.example.league_of_legends.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SkinTest {
    Skin skin = new Skin("URL", "default", "18/01/2011", 0, true);

    @Test
    public void shouldGetAttributes() {
        assertEquals("default", skin.getName());
        assertEquals("18/01/2011", skin.getReleaseDate());
        assertTrue(skin.getObtainable());
        assertEquals(0, skin.getRiotPointPrice());
    }

    @Test
    public void shouldSetObtainable() {
        skin.setObtainable(false);
        assertFalse(skin.getObtainable());
    }

}
