package converter;

import exceptions.ConvertFormatXmlToJsonException;
import format.FormatType;
import format.IFormatObject;
import format.XmlFormat;
import org.json.JSONException;
import org.json.XML;


public class JsonToXmlFormatConverter implements FormatConverter {
    @Override
    public IFormatObject convertFormat(IFormatObject jsonFormat, FormatType formatTypeToConvert) throws ConvertFormatXmlToJsonException {
        try {
            return new XmlFormat(formatTypeToConvert.getXmlHeader() + XML.toString(new org.json.JSONObject(jsonFormat.getFormatDataAsString())));
        } catch (JSONException e) {
            throw new ConvertFormatXmlToJsonException("Error when converting json object to xml" + e.getMessage());
        }
    }
}
