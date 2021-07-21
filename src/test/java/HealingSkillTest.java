import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealingSkillTest {

    @Test
    public void shouldGetHealing() {
        HealingSkill skill = new HealingSkill(50, "exemplo", 100, "exemplo nome");
        assertEquals(100, skill.getHealing());
    }
}
