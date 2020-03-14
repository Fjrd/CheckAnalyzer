import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CustomJsonParser {
    static JsonReader reader;
    static Gson gson;
    static Check check;

    public CustomJsonParser() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException {
        reader = new JsonReader(new FileReader("/home/fjrd/Polytech_Labs/j200/check-to-db/src/test.json"));
        gson = new Gson();
        check = gson.fromJson(reader, Check.class);
        check.toScreen();

    }


}
