package labs.LabN1.Singletone;

public class SingletonService {
    public void exec() {
        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();

        System.out.println("Подключение к базе данных №1 "+connection1.toString());
        System.out.println("Подключение к базе данных №2 "+connection2.toString());
    }
}
