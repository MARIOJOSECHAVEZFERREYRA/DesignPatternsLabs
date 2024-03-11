package labs.LabN1.Abstract_fabric;

class WebCheckbox implements Checkbox {

    private boolean state;

    public void render() {
        System.out.printf("render WebCheckbox. With state %s%n", state);
        }

    public boolean state() {
        return state;
    }

    public Checkbox state(boolean state) {
        this.state = state;
        return this;
    }
    }
