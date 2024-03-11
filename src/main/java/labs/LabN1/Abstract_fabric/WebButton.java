package labs.LabN1.Abstract_fabric;

public class WebButton implements Button {
    public void render() {
        System.out.println("Abstract Fabric Method: render WebButton");
    }

    public void onClick() {
        System.out.println("Event on click  WebButton");
    }
}
