import org.junit.jupiter.api.Test;
import org.example.LabsTP.LabN2.adapter.RoundHole;
import org.example.LabsTP.LabN2.adapter.SquareStick;
import org.example.LabsTP.LabN2.adapter.SquareStickAdapter;

import static org.junit.jupiter.api.Assertions.*;

public class AdapterTest {
    @Test
    public void main() {
        RoundHole hole = new RoundHole(5);
        SquareStick smallSquareStick = new SquareStick(5);
        SquareStick largeSquareStick = new SquareStick(10);
        SquareStickAdapter smallSquareStickAdapter = new SquareStickAdapter(smallSquareStick);
        SquareStickAdapter largeSquareStickAdapter = new SquareStickAdapter(largeSquareStick);

        assertTrue(hole.fits(smallSquareStickAdapter)); // Expect True
        assertFalse(hole.fits(largeSquareStickAdapter)); //Expect False
    }
}
