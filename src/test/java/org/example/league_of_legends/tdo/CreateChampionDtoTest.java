package org.example.league_of_legends.tdo;

import org.example.league_of_legends.dto.CreateChampionDto;
import org.example.league_of_legends.model.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateChampionDtoTest {

    public CreateChampionDto createAChampionTdoTest() {
        CreateChampionDto championDto = new CreateChampionDto();
        States states = new States(575, "fúria", 100, 35, 69, 32, 345, 125, 0.66);
        ArrayList<Skill> skill = new ArrayList<>();
        Skill skill1 = new PassiveSkill("exemplo de nome", 0, "exemplo de descrição");
        skill.add(skill1);
        Features features = new Features("lutador", "fácil", "exemplo", "corpo a corpo");
        Skin skin = new Skin("default", "18/01/2011", 0, true);
        championDto.setStates(states);
        championDto.setSkinDefault(skin);
        championDto.setSkills(skill);
        championDto.setFeatures(features);
        championDto.setInfluencePointPrice(4000);
        championDto.setRiotPointPrice(450);
        championDto.setReleaseDate("18/01/2011");
        championDto.setName("Renekton");
        championDto.setPosition("top/mid");
        return championDto;
    }

    @Test
    public void shouldGetName() {
        assertEquals("Renekton", createAChampionTdoTest().getName());
    }

    @Test
    public void shouldGetPosition() {
        assertEquals("top/mid", createAChampionTdoTest().getPosition());
    }

    @Test
    public void shouldGetStates() {
        States states = createAChampionTdoTest().getStates();
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
        ArrayList<Skill> skill = createAChampionTdoTest().getSkills();
        assertEquals(1, skill.size());
    }

    @Test
    public void shouldGetFeatures() {
        Features features = createAChampionTdoTest().getFeatures();
        assertEquals("lutador", features.getFunction());
        assertEquals("fácil", features.getDifficulty());
        assertEquals("exemplo", features.getStory());
        assertEquals("corpo a corpo", features.getAttackType());
    }

    @Test
    public void shouldGetSkin() {
        Skin skin = createAChampionTdoTest().getSkinDefault();
        assertEquals("default", skin.getName());
        assertEquals("18/01/2011", skin.getReleaseDate());
        assertTrue(skin.getObtainable());
        assertEquals(0, skin.getRiotPointPrice());
    }

    @Test
    public void shouldGetInfluencePointPrice() {
        assertEquals(4000, createAChampionTdoTest().getInfluencePointPrice());
    }

    @Test
    public void shouldGetRiotPointPrice() {
        assertEquals(450, createAChampionTdoTest().getRiotPointPrice());
    }

    @Test
    public void shouldGetReleaseDate() {
        assertEquals("18/01/2011", createAChampionTdoTest().getReleaseDate());
    }

}
