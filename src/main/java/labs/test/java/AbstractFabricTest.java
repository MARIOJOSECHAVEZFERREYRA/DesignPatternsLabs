import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.LabsTP.LabN1.Abstract_fabric.Configuration;
import org.junit.jupiter.api.Test;


public class AbstractFabricTest {
    @Test
    public void main() throws Exception {

//        Configuration mob = Configuration.initMob();
//        assertEquals(Configuration.MOB, mob.getPlatform());

        Configuration web = Configuration.initWeb();
        assertEquals(Configuration.WEB, web.getPlatform());

    }
}

