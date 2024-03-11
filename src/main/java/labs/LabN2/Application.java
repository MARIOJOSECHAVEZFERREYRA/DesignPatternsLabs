package org.example.LabsTP.LabN2;

import org.example.LabsTP.LabN2.adapter.AdapterService;
import org.example.LabsTP.LabN2.bridge.BridgeService;
import org.example.LabsTP.LabN2.proxy.ProxyService;

public class Application {
    public static void main(String[] args) {

       BridgeService bridgeService = new BridgeService();
       bridgeService.exec();

       AdapterService adapterService = new AdapterService();
       adapterService.exec();

       ProxyService proxyService = new ProxyService();
       proxyService.exec();



    }
}
