import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFIleReader {
    public Properties ReadConfigFile() throws IOException {
        String propFileName = "config.properties";
        try (InputStream input = this.getClass().getClassLoader().getResourceAsStream(propFileName)) {
            if (input == null) {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
            Properties prop = new Properties();
            prop.load(input);
            return prop;
        }
    }
}
