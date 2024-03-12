import org.example.LabsTP.LabN3.Strategy.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {

    @Test
    public void test() {
        List<String> strings = new ArrayList<>();
        strings.add("Первая");
        strings.add("Вторая");
        strings.add("Третья");
        strings.add("Четвертая");
        strings.add("Пятая");

        Strategy strategy = new CommaSeparatedStrategy();
        StrategyService service = new StrategyServiceImpl(strategy);

        assertEquals("Первая,Вторая,Третья,Четвертая,Пятая", service.exec(strings));

        strategy = new SemicolonSeparatedStrategy();
        service.setStrategy(strategy);
        assertEquals("Первая;Вторая;Третья;Четвертая;Пятая", service.exec(strings));
    }
}
