package format;

public enum FormatType {
    XML,
    JSON;

    public String getXmlHeader(){
        return "<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\" standalone=\\\"yes\\\"?>\\n";
    }
}
