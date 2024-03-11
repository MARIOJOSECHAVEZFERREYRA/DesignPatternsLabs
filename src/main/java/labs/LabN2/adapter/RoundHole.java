package org.example.LabsTP.LabN2.adapter;

public class RoundHole {

    private final int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundStick stick) {
        return this.getRadius() >= stick.getRadius();
    }

}