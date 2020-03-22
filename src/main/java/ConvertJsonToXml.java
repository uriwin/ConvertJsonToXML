import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;


public class ConvertJsonToXml {
    public static byte[] convertJsonToXmlRawBytes(JSONObject jsonObject) {
        String XMLHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n";
        try {
            String xmlData = XMLHeader + XML.toString(jsonObject);
            return xmlData.getBytes();
        } catch (JSONException err) {
            System.out.println("Error" + err.toString());
            throw err;
        }
    }
}
