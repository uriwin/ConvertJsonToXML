package format;

import org.json.JSONObject;

public class JsonFormat implements IFormatObject {
    JSONObject jsonObject;
    public JsonFormat(JSONObject jsonObject){
        this.setJsonObject(jsonObject);
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    @Override
    public FormatType getFormatType() {
        return FormatType.JSON;
    }

    @Override
    public String getFormatDataAsString() {
        return this.jsonObject.toString();
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }
}
