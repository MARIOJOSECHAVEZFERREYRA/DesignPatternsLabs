package org.example.LabsTP.LabN2.adapter;

public class AdapterService {

    public void exec() {
        RoundHole hole = new RoundHole(5);
        RoundStick roundStick = new RoundStick(5);
        System.out.println("Значение: "+ hole.fits(roundStick));

        SquareStick smallSquareStick = new SquareStick(5);
        SquareStick largeSquareStick = new SquareStick(10);

        SquareStickAdapter smallSquareStickAdapter = new SquareStickAdapter(smallSquareStick);
        SquareStickAdapter largeSquareStickAdapter = new SquareStickAdapter(largeSquareStick);

        System.out.println("Значение: "+ hole.fits(smallSquareStickAdapter));

        System.out.println("Значение: "+ hole.fits(largeSquareStickAdapter));
    }

}