import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

public class ReadGZIP {
    public org.json.JSONObject readGZIPToJsonObject(String FileName) throws IOException, ParseException {

        FileInputStream fileInputStream = new FileInputStream(FileName);
        GZIPInputStream gzipInputStream = new GZIPInputStream(fileInputStream);
        InputStreamReader inputStreamReader = new InputStreamReader(gzipInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(bufferedReader);
        return new org.json.JSONObject(((org.json.simple.JSONObject) obj).toJSONString());
    }


}

