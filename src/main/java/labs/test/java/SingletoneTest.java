import org.example.LabsTP.LabN1.Singletone.Connection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SingletoneTest {
    @Test
    public void main() {
        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();
        Assertions.assertEquals(connection1, connection2);;
    }
}
