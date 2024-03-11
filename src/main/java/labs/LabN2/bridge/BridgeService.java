package org.example.LabsTP.LabN2.bridge;

public class BridgeService {

    public void exec() {
        testDevice(new Radio());
    }

    private void testDevice(Device device) {
        System.out.println("Тест с базовым пультом");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Тест с продвинутым пультом");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        device.printStatus();
        advancedRemote.mute();
        device.printStatus();
    }

}