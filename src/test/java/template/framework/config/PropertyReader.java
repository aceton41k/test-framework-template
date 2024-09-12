package template.framework.config;

import lombok.Getter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Класс чтения настроек из файла test.properties
 */
public class PropertyReader {
    @Getter
    private static final Properties properties;
    @Getter
    private static final String baseUrl;

    static {
        properties = new Properties();
        try (InputStream inputStream = new FileInputStream("src/test/resources/test.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
            baseUrl = properties.getProperty("api.url");
    }

    private PropertyReader() {
    }
}