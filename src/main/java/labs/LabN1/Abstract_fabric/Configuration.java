package labs.LabN1.Abstract_fabric;

public class Configuration {

    public final static int WEB = 1;
    public final static int MOB = 2;

    private int platform;

    public int getPlatform() {
        return platform;
    }

    public Configuration setPlatform(int platform) {
        this.platform = platform;
        return this;
    }

    public static Configuration initWeb() {
        return new Configuration().setPlatform(WEB);
    }

    public static Configuration initMob() {
        return new Configuration().setPlatform(MOB);
    }

}
