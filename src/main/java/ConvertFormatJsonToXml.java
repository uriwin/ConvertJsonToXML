import exceptions.ConvertFormatXmlToJsonException;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;


public class ConvertFormatJsonToXml {
    public String convertFormatJsonToXml(JSONObject jsonObject, String XMLHeader) throws ConvertFormatXmlToJsonException {
        try {
            return XMLHeader + XML.toString(jsonObject);
        } catch (JSONException e) {
            throw new ConvertFormatXmlToJsonException("Error when converting json object to xml" + e.getMessage());
        }
    }
}
