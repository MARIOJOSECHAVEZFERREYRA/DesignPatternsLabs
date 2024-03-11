package org.example.LabsTP.LabN2.adapter;

public class SquareStickAdapter extends RoundStick {

    private final SquareStick stick;

    public SquareStickAdapter(SquareStick stick) {
        super();

        this.stick = stick;
    }

    public int getRadius() {
        return (int) (stick.getWidth() * Math.sqrt(2) / 2);
    }

}