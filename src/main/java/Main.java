import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String FILENAME = "data_example2.json.gz";
        try {
            String GZIPJsonData = ReadGZIP.readGZIP(FILENAME);
            String xmlData = ConvertJsonToXml.convertJsonToXml(GZIPJsonData);
            System.out.println("Successfully Converted to xml, The xml looks like: " + xmlData);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
