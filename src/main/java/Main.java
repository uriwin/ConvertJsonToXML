import org.json.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFilename = "data_example.json.gz";
        String outPutFileName = "data_example.xml";
        try {
            JSONObject jsonObject = ReadGZIP.readGZIPToJsonObject(inputFilename);
            byte[] xmlData = ConvertJsonToXml.convertJsonToXmlRawBytes(jsonObject);
            OutputStreamWriteXml outputStreamWriteXml = new OutputStreamWriteXml(outPutFileName);
            outputStreamWriteXml.writeXml(xmlData);
            outputStreamWriteXml.closeOutputStream();
            System.out.println("Successfully Converted json to xml");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
