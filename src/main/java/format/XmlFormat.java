package format;

public class XmlFormat implements IFormatObject {
    public String xmlData;

    public XmlFormat(String xmlData) {
        this.xmlData = xmlData;
    }

    public void setXmlData(String xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public FormatType getFormatType() {
        return FormatType.XML;
    }

    @Override
    public String getFormatDataAsString() {
        return this.xmlData;
    }
}
