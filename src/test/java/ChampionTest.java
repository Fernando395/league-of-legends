import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ChampionTest {

    @Test
    public void shouldGetName() {
        SecondaryBar secondaryBar = new SecondaryBar("fúria", 100);
        States states = new States(575, secondaryBar, 35, 69, 32, 345, 125, 0.66);
        ArrayList<Skill> skill = new ArrayList<>();
        Skill skill1 = new PassiveSkills("DOMÍNIO DA IRA",0, "Os ataques de Renekton geram Fúria, que aumenta quando ele estiver com a Vida baixa. Essa Fúria pode fortalecer suas habilidades com efeitos adicionais.");
        skill.add(skill1);
        Features features = new Features("lutador", "facil", "exemplo", "corpo a corpo");
        Champion champion = new Champion("Renekton", "top/mid", skill, states, features);
        Assertions.assertEquals("Renekton", champion.getName());
    }
}
