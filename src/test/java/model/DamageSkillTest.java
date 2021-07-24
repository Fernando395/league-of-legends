package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DamageSkillTest {

    @Test
    public void shouldGetDamage() {
        DamageSkill skill = new DamageSkill(50, "exemplo", 100, "exemplo nome");
        assertEquals(100, skill.getDamage());
    }
}
