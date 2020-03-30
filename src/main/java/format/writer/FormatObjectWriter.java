package format.writer;

import format.IFormatObject;

import java.io.IOException;

public interface FormatObjectWriter {
    public void writeFormat(IFormatObject format) throws IOException;
}
