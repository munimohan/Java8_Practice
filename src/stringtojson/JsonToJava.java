package stringtojson;

import stringtojson.Request;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonToJava {

    public static void main(String[] args) throws IOException {
        try(Reader reader = new InputStreamReader(JsonToJava.class.getResourceAsStream("/stringtojson/edgenetInbound.json"), "UTF-8")){
            Gson gson = new GsonBuilder().create();
            Request edgenetReq = gson.fromJson(reader, Request.class);
            System.out.println(edgenetReq);
        }
    }
}
