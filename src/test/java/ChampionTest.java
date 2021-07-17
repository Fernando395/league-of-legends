import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ChampionTest {

    @Test
    public void shouldGetName(){
        SecondaryBar secondaryBar = new SecondaryBar("fúria",100);
        States states = new States(575,secondaryBar,35,69,32,345,125,0.66);
        ArrayList<Skill> skill = new ArrayList<>();
        Features features = new Features("lutador","facil","exemplo","corpo a corpo");
        Champion champion = new Champion("Renekton","top/mid",skill,states,features);
        Assertions.assertEquals("Renekton",champion.getName());
    }
}
