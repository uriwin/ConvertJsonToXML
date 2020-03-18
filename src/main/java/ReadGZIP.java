import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

public class ReadGZIP {
    public static String readGZIP(String FileName) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(FileName);
        GZIPInputStream gzipInputStream = new GZIPInputStream(fileInputStream);
        InputStreamReader inputStreamReader = new InputStreamReader(gzipInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String FileInputRawData = new String("");
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            FileInputRawData += line;
        }
        System.out.println("gz file raw data: " + FileInputRawData);
        return FileInputRawData;
    }
}
