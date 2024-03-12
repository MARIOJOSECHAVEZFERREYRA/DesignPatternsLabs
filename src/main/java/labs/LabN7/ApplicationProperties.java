package org.example.LabsTP.LabN7;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class ApplicationProperties {
    private static final String FILE_NAME = "/application.properties";

    private static ApplicationProperties INSTANCE;

    private final Properties properties = new Properties();

    public static ApplicationProperties getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new ApplicationProperties();
            INSTANCE.init();
        }

        return INSTANCE;
    }

    private void init() {
        try (InputStream is = getClass().getResourceAsStream(FILE_NAME)) {
            if (Objects.nonNull(is)) {
                properties.load(is);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public Properties getProperties() {
        return properties;
    }
}

