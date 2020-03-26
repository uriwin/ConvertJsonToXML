import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class XmlWriter {
    String outputFileName;

    public XmlWriter(String outputFileName) throws FileNotFoundException {
        this.outputFileName = outputFileName;
    }

    public void writeXml(String xmlData) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(this.outputFileName)) {
            outputStream.write(xmlData.getBytes());
        }
    }
}
