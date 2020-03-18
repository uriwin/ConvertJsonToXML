import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class ConvertJsonToXml {
    public static String convertJsonToXml(String jsonRawData){

        try {
            JSONObject fileDataJson = new JSONObject(jsonRawData);
            return XML.toString(fileDataJson);

        } catch (JSONException err) {
            System.out.println("Error" + err.toString());
            throw err;
        }
    }
}
