import org.example.LabsTP.LabN3.chain.Request;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RequestTest {
    @Test
    public void test() {
        final String testString = "test";

        Request request = new Request();
        assertEquals(request, request.setInputStream(testString));
        assertEquals(request, request.setMethod(testString));
        assertEquals(request, request.setPath(testString));
        assertEquals(request, request.setSession(testString));

        assertEquals(testString, request.getInputStream());
        assertEquals(testString, request.getMethod());
        assertEquals(testString, request.getPath());
        assertEquals(testString, request.getSession());
    }
}
