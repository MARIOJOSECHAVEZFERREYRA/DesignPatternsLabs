package labs.LabN1.Abstract_fabric;

class MobFormElementFactory implements FormElementFactory {

    public Button createButton() {
        return new MobButton();
    }

    public Checkbox createCheckbox() {
        return new MobCheckbox();
    }

    public Input createInput() {
        return new MobInput();
    }

}
