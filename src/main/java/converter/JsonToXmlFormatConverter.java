package converter;

import exceptions.ConvertFormatXmlToJsonException;
import format.FormatType;
import format.IFormatObject;
import format.XmlFormat;
import format.XmlUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;


public class JsonToXmlFormatConverter implements FormatConverter {
    @Override
    public IFormatObject convertFormat(IFormatObject jsonFormat, FormatType formatTypeToConvert) throws ConvertFormatXmlToJsonException {
        XmlUtils xmlUtils = new XmlUtils();
        try {
            JSONObject jsonObject = new JSONObject(jsonFormat.getFormatDataAsString());
            String xmlHeader = xmlUtils.getXmlHeader();
            return new XmlFormat(xmlHeader + XML.toString(jsonObject));
        } catch (JSONException e) {
            throw new ConvertFormatXmlToJsonException("Error when converting json object to xml" + e.getMessage());
        }
    }
}
