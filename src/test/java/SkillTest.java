
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SkillTest {

    @Test
    public void shouldGetAttributes(){
        Skill skill = new Skill(30,"exemplo","exemplo de nome");
        assertEquals(30,skill.getCost());
        assertEquals("exemplo",skill.getDescription());
        assertEquals("exemplo de nome",skill.getName());
    }
}
