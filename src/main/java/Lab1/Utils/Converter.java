package Lab1.Utils;
import com.fasterxml.jackson.databind.ObjectMapper;
import Lab1.Dots;

import java.io.File;
import java.io.IOException;

public class Converter {
        private static final String f = FileToSave.getFileName();

        public static void toJSON(Dots dots) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                mapper.writeValue(new File(f), dots);
                System.out.println("json created!");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        public static Dots toJavaObject() {
            try {
                ObjectMapper mapper = new ObjectMapper();
                return mapper.readValue(new File(f), Dots.class);
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return new Dots();
            }
        }

}
