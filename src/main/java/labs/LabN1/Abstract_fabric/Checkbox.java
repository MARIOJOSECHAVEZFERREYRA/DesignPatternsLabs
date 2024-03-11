package labs.LabN1.Abstract_fabric;

public interface Checkbox {
    void render();

    Checkbox state(boolean state);

    boolean state();
}
