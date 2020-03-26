import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;


public class ConvertFormatJsonToXml {
    public String convertFormatJsonToXml(JSONObject jsonObject, String XMLHeader) throws IOException {
        try {
            return XMLHeader + XML.toString(jsonObject);
        } catch (JSONException err) {
            System.out.println("Error" + err.toString());
            throw err;
        }
    }
}
