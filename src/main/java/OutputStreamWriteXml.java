import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamWriteXml {
    OutputStream outputStream;
    public OutputStreamWriteXml(String outputFileName) throws FileNotFoundException {
        this.outputStream =  new FileOutputStream(outputFileName);
    }
    public void writeXml(byte[] xmlData) throws IOException {
        this.outputStream.write(xmlData);
    }
    public void closeOutputStream() throws IOException {
        this.outputStream.flush();
        this.outputStream.close();
    }
}
