import org.example.LabsTP.LabN1.Fabric_method.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class FabriceMethodTest {

    @Test
    public void main() {

        //Configuration mob = Configuration.initMob();
//        Assertions.assertEquals(Configuration.MOB, mob.getPlatform());

        Configuration web = Configuration.initWeb();
        Assertions.assertEquals(Configuration.WEB, web.getPlatform());
    }
}

