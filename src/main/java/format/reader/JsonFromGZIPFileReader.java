package format.reader;

import exceptions.ReadGZIPFileException;
import format.reader.FormatObjectReader;
import format.IFormatObject;
import format.JsonFormat;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.zip.GZIPInputStream;

public class JsonFromGZIPFileReader implements FormatObjectReader {

    @Override
    public IFormatObject readFormatObjectFromFile(String FileName) throws ReadGZIPFileException{
        try {
            FileInputStream fileInputStream = new FileInputStream(FileName);
            GZIPInputStream gzipInputStream = new GZIPInputStream(fileInputStream);
            InputStreamReader inputStreamReader = new InputStreamReader(gzipInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(bufferedReader);
            JSONObject jsonObject =  new org.json.JSONObject(((org.json.simple.JSONObject) obj).toJSONString());
            return new JsonFormat(jsonObject);
        } catch (IOException e) {
            throw new ReadGZIPFileException("Error while reading GZIP file ", e);
        } catch (ParseException e) {
            throw new ReadGZIPFileException("Error while converting GZIP file data to json object ", e);
        }

    }
}

