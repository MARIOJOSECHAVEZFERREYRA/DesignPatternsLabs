package labs.LabN1.Abstract_fabric;

class MobButton implements Button {
    public void render() {

        System.out.println("Abstract Fabric Method: render MobButton");
    }

    public void onClick() {

        System.out.println("Event on click MobButton");
    }
}
