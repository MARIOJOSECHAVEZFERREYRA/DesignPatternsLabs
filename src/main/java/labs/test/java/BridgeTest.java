import org.junit.jupiter.api.Test;
import org.example.LabsTP.LabN2.bridge.BasicRemote;
import org.example.LabsTP.LabN2.bridge.Radio;
import org.example.LabsTP.LabN2.bridge.Tv;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BridgeTest {
    @Test
    public void main() {

        Radio radio = new Radio();
        BasicRemote basicRemote = new BasicRemote(radio);
        basicRemote.power();
        assertEquals(radio.getChannel(), 1);
        assertEquals(radio.getVolume(), 30);

        assertTrue(radio.isEnabled());

        Tv tv = new Tv();
        BasicRemote basicRemote1 = new BasicRemote(tv);
        basicRemote1.power();

        assertEquals(tv.getChannel(), 1);
        assertEquals(tv.getVolume(), 30);
        assertTrue(tv.isEnabled());
    }
}


