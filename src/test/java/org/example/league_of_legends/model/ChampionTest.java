package org.example.league_of_legends.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ChampionTest {

    public Champion createAChampionTest() {
        States states = new States(575, "fúria", 100, 35, 69, 32, 345, 125, 0.66);
        ArrayList<Skill> skill = new ArrayList<>();
        Skill skill1 = new PassiveSkill("exemplo de nome", 0, "exemplo de descrição");
        skill.add(skill1);
        Features features = new Features("lutador", "fácil", "exemplo", "corpo a corpo");
        Skin skin = new Skin( "URL","default", "18/01/2011", 0, true);
        return new Champion("URL", "Renekton", "top/mid", skill, states, features, skin, "18/01/2011", 4800, 450);
    }

    @Test
    public void shouldGetName() {
        assertEquals("Renekton", createAChampionTest().getName());
    }

    @Test
    public void shouldGetPosition() {
        assertEquals("top/mid", createAChampionTest().getPosition());
    }

    @Test
    public void shouldGetStates() {
        States states = createAChampionTest().getStates();
        assertEquals(575, states.getHealth());
        assertEquals("fúria", states.getResourceType());
        assertEquals(100, states.getResourceAmount());
        assertEquals(35, states.getArmor());
        assertEquals(69, states.getAttackDamage());
        assertEquals(32, states.getMagicResist());
        assertEquals(345, states.getMoveSpeed());
        assertEquals(125, states.getAttackRange());
        assertEquals(0.66, states.getAttackSpeed());
    }

    @Test
    public void shouldCheckChampionSkills() {
        ArrayList<Skill> skill = createAChampionTest().getSkills();
        assertEquals(1, skill.size());
    }

    @Test
    public void shouldGetFeatures() {
        Features features = createAChampionTest().getFeatures();
        assertEquals("lutador", features.getFunction());
        assertEquals("fácil", features.getDifficulty());
        assertEquals("exemplo", features.getStory());
        assertEquals("corpo a corpo", features.getAttackType());
    }

    @Test
    public void shouldGetSkin() {
        Skin skin = createAChampionTest().getSkinDefault();
        assertEquals("default", skin.getName());
        assertEquals("18/01/2011", skin.getReleaseDate());
        assertTrue(skin.getObtainable());
        assertEquals(0, skin.getRiotPointPrice());
    }

    @Test
    public void shouldRemoveSkin() {
        Champion champion = createAChampionTest();
        Skin skin = new Skin( "URL","default", "18/01/2011", 0, true);
        champion.addSkin(skin);
        assertEquals(1, champion.getSkins().size());
        champion.removeSkin(skin);
        assertEquals(0, champion.getSkins().size());
    }

    @Test
    public void shouldUpdateSkin() {
        Champion champion = createAChampionTest();
        Skin fioraSkin = new Skin( "URL","Fiora", "18/01/2011", 0, true);
        champion.addSkin((Skin) fioraSkin.clone());
        fioraSkin.setRiotPointPrice(450);
        champion.updateSkin(fioraSkin);
        assertEquals(450,champion.getSkins().get(0).getRiotPointPrice());
    }

    @Test
    public void shouldGetSkins() {
        Champion champion = createAChampionTest();
        champion.addSkin(new Skin("URL", "default", "18/01/2011", 0, true));
        assertEquals(1, champion.getSkins().size());
    }

    @Test
    public void shouldGetRiotPointPrice() {
        assertEquals(450, createAChampionTest().getRiotPointPrice());
    }

    @Test
    public void shouldGetInfluencePointPrice() {
        assertEquals(4800, createAChampionTest().getInfluencePointPrice());
    }

    @Test
    public void shouldReleaseDateOf() {
        assertEquals("18/01/2011", createAChampionTest().getReleaseDate());
    }
}
