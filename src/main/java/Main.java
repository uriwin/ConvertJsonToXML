import org.json.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadPropertyFIle readConfigFIle = new ReadPropertyFIle();
        ReadGZIP readGZIP = new ReadGZIP();
        ConvertFormatJsonToXml convertJsonToXml = new ConvertFormatJsonToXml();

        Properties properties = readConfigFIle.ReadConfigFile();
        try {
            JSONObject jsonObject = readGZIP.readGZIPToJsonObject(properties.getProperty("inputFileName"));
            String xmlData = convertJsonToXml.convertFormatJsonToXml(jsonObject, properties.getProperty("XMLHeader"));
            XmlWriter xmlWriter = new XmlWriter(properties.getProperty("outputFileName"));
            xmlWriter.writeXml(xmlData);
            System.out.println("Successfully Converted json to xml");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
