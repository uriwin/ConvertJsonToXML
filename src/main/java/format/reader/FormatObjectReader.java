package format.reader;

import format.IFormatObject;

public interface FormatObjectReader {
    public IFormatObject readFormatObjectFromFile(String FileName) throws Exception;
}
