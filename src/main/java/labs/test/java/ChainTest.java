import org.example.LabsTP.LabN3.chain.ChainService;
import org.example.LabsTP.LabN3.chain.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ChainTest {

    @Test
    public void main() {
        String inputStream = "method:methodtest\npath:pathtest\nsession:sessiontest";
        ChainService service = new ChainService();
        Request request = service.exec(inputStream);

        assertEquals("methodtest", request.getMethod());
        assertEquals("pathtest", request.getPath());
        assertEquals("sessiontest", request.getSession());
    }
}
