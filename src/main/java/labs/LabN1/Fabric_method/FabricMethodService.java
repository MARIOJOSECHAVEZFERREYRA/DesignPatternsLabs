package labs.LabN1.Fabric_method;

public class FabricMethodService {


    public void exec() throws Exception {
        Configuration configuration = Configuration.initMob();

        Dialog dialog;
        switch (configuration.getPlatform()) {
            case (Configuration.WEB):
                dialog = new WebDialog();
                dialog.render();
                break;
            case (Configuration.MOB):
                dialog = new MobDialog();
                dialog.render();
                break;
            default:
                throw new Exception("Неизвестный тип платформы");
        }


    }
}
