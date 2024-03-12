
import org.example.LabsTP.LabN7.Hibernate.HibernateSessionService;
import org.junit.jupiter.api.Test;

public class HibernateServiceTest {

    @Test
    public void test() {
        HibernateSessionService service = new HibernateSessionService();
        service.exec();
    }
}