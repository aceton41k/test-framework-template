package template.framework.test.config;

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
        try (InputStream inputStream = new FileInputStream("src/main/resources/test.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
            baseUrl = properties.getProperty("cat.facts.url");
    }

    private PropertyReader() {
    }

    public static String getStand() {
        String stand;
        if (baseUrl.contains("dev"))
            stand = "dev";
        else if (baseUrl.contains("qa"))
            stand = "qa";
        else throw new RuntimeException("Не удалось опознать стенд");

        return stand;
    }


    public static String getWebSocketUrl() {
        return getProperties().getProperty(getStand() + ".ws.url");
    }


    public static String getJiraIssueUrl() {
        return getProperties().getProperty("jira.issue.url");
    }
}