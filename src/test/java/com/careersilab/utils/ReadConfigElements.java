package com.careersilab.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigElements {

    Properties properties = new Properties();
    String propertyFilePath = System.getProperty("user.dir") + "/src/test/java/config/config.properties";

    public Properties getElementProperties() throws IOException {
        InputStream stream = new FileInputStream(new File(propertyFilePath));
        properties.load(stream);

        return properties;
    }
}
