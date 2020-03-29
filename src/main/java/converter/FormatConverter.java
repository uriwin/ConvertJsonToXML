package converter;

import format.FormatType;
import format.IFormatObject;

public interface FormatConverter {
    public IFormatObject convertFormat(IFormatObject formatObject, FormatType formatTypeToConvert) throws Exception;
}
