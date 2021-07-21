import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilitySkillTest {

    @Test
    public void shouldCreateAUtilitySkill() {
        ArrayList<Skill> skills = new ArrayList<>();
        UtilitySkill skill = new UtilitySkill(50, "exemplo", "exemplo nome");
        skills.add(skill);
        assertEquals(1, skills.size());
    }
}
