package labs.LabN1.Abstract_fabric;

public class WebInput implements Input {
    private String value;

    public void value(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public void render() {
        System.out.printf("render WebInput. With value %s%n", value);
    }
}
