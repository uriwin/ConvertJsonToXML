import exceptions.ReadGZIPFileException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.zip.GZIPInputStream;

public class ReadGZIP {
    public org.json.JSONObject readGZIPToJsonObject(String FileName) throws ReadGZIPFileException {
        try {
            FileInputStream fileInputStream = new FileInputStream(FileName);
            GZIPInputStream gzipInputStream = new GZIPInputStream(fileInputStream);
            InputStreamReader inputStreamReader = new InputStreamReader(gzipInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(bufferedReader);
            return new org.json.JSONObject(((org.json.simple.JSONObject) obj).toJSONString());
        } catch (IOException e) {
            throw new ReadGZIPFileException("Error while reading GZIP file " + e.getMessage());
        } catch (ParseException e) {
            throw new ReadGZIPFileException("Error while converting GZIP file data to json object " + e.getMessage());
        }

    }


}

