package labs.LabN1.Singletone;

public class Connection {
    private static Connection instance;

    private Connection() {
    }

    public static Connection getInstance() {
        if (null != instance)
            return instance;

        instance = new Connection();
        return instance;
    }

}
