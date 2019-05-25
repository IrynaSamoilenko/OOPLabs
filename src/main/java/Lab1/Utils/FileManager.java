package Lab1.Utils;
import Lab1.Dot;

import java.io.*;

public class FileManager {

    private static final String f = FileToSave.getFileName();

    public static void writeFile(Dot[] dots) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(f))) {
            os.writeObject(dots);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Dot[] readFile() {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(f))) {
            return ((Dot[]) is.readObject());
        } catch (FileNotFoundException e) {
            System.out.println("File for reading not found!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return new Dot[0];
    }
}
