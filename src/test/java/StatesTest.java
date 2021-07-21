import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatesTest {

    States states = new States(575, "fúria", 100, 35, 69, 32, 345, 125, 0.66);

    @Test
    public void shouldGetHealth() {
        Assertions.assertEquals(575, states.getHealth());
    }

    @Test
    public void shouldGetResourceType() {
        Assertions.assertEquals("fúria", states.getResourceType());
    }

    @Test
    public void shouldGetResourceAmount() {
        Assertions.assertEquals(100, states.getResourceAmount());
    }

    @Test
    public void shouldGetArmor() {
        Assertions.assertEquals(35, states.getArmor());
    }

    @Test
    public void shouldGetAttackDamage() {
        Assertions.assertEquals(69, states.getAttackDamage());
    }

    @Test
    public void shouldGetMagicResist() {
        Assertions.assertEquals(32, states.getMagicResist());
    }

    @Test
    public void shouldGetMoveSpeed() {
        Assertions.assertEquals(345, states.getMoveSpeed());
    }

    @Test
    public void shouldGetAttackRange() {
        Assertions.assertEquals(125, states.getAttackRange());
    }

    @Test
    public void shouldGetAttackSpeed() {
        Assertions.assertEquals(0.66, states.getAttackSpeed());
    }
}
