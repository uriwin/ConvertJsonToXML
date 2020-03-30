package format.writer;

import format.writer.FormatObjectWriter;
import format.IFormatObject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class XmlWriter implements FormatObjectWriter {
    String outputFileName;

    public XmlWriter(String outputFileName) throws FileNotFoundException {
        this.outputFileName = outputFileName;
    }

    @Override
    public void writeFormat(IFormatObject xml) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(this.outputFileName)) {
            outputStream.write(xml.getFormatDataAsString().getBytes());
        }
    }
}
