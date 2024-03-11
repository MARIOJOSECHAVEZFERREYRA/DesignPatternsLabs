package labs.LabN1.Abstract_fabric;

public class AbstractFabricService {

    private FormElementFactory initFactory() throws Exception {
        Configuration configuration = Configuration.initMob();

        FormElementFactory factory;
        switch (configuration.getPlatform()) {
            case (Configuration.WEB):
                factory = new WebFormElementFactory();
                return factory;
            case (Configuration.MOB):
                factory = new MobFormElementFactory();
                return factory;
            default:
                throw new Exception("Неизвестный тип платформы");
        }


    }

    private void renderForm(FormElementFactory factory) {
        Input input = factory.createInput();
        Button button = factory.createButton();

        input.value("Тестовое значение поля ввода данных");
        input.render();
        button.render();
    }

    public void exec() throws Exception {
        renderForm(initFactory());
    }

}
