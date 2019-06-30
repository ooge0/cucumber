package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Resources {

    public static String envPropertyFilePath() {
        String envPropertyFilePath = "./src/test/java/env.properties";
        return envPropertyFilePath;
    }

    public static String getEnvValue() throws IOException {
        String serviceURL = null;
        String envValue = System.getProperty("urlConfig");
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(Resources.envPropertyFilePath());
        prop.load(fis);
        if ("GOOGLE".equals(envValue)) {
            serviceURL = (String) prop.get("ENDPOINT_GOOGLE");
        } else if ("SS".equals(envValue)) {
            serviceURL = (String) prop.get("ENDPOINT_SS");
        } else if ("OOGE0".equals(envValue)) {
            serviceURL = (String) prop.get("ENDPOINT_OOGE0");
        } else {
            System.out.println(Warnings.defaultEnvWarning());
        }
        return serviceURL;
    }
}
