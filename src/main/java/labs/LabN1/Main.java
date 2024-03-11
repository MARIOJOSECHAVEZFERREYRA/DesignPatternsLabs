package labs.LabN1;

import labs.LabN1.Singletone.SingletonService;
import labs.LabN1.Abstract_fabric.AbstractFabricService;
import labs.LabN1.Builder.BuilderService;
import labs.LabN1.Fabric_method.FabricMethodService;

public class Main {
    public static void main(String[] args) throws Exception {


        SingletonService singletonService = new SingletonService();
        singletonService.exec();

        System.out.println("---");

        AbstractFabricService abstractFabricService = new AbstractFabricService();
        abstractFabricService.exec();

        System.out.println("---");

        FabricMethodService fabricMethodService = new FabricMethodService();
        fabricMethodService.exec();

        System.out.println("---");

        BuilderService builderService = new BuilderService();
        builderService.exec();

    }
}
