import converter.JsonToXmlFormatConverter;
import exceptions.ConvertFormatXmlToJsonException;
import exceptions.ReadGZIPFileException;
import format.FormatType;
import format.IFormatObject;
import format.reader.JsonFromGZIPFileReader;
import format.writer.XmlWriter;

import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws ReadGZIPFileException, ConvertFormatXmlToJsonException, IOException {
        PropertyFIleReader readConfigFIle = new PropertyFIleReader();
        JsonFromGZIPFileReader jsonFromGZIPFileReader = new JsonFromGZIPFileReader();
        JsonToXmlFormatConverter convertJsonToXml = new JsonToXmlFormatConverter();

        Properties properties = readConfigFIle.ReadConfigFile();
        IFormatObject json = jsonFromGZIPFileReader.readFormatObjectFromFile(properties.getProperty("inputFileName"));
        IFormatObject xml = convertJsonToXml.convertFormat(json, FormatType.XML);
        XmlWriter xmlWriter = new XmlWriter(properties.getProperty("outputFileName"));
        xmlWriter.writeFormat(xml);
        System.out.println("Successfully Converted json to xml");
    }
}
