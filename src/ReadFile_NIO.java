import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//String filename = "/home/murad_isgandar/Desktop/test"    it is only example  filename shows us its path
public class ReadFile_NIO {

    public static void main(String[] args) throws IOException {
        String s = readFileAsString("/home/murad_isgandar/Desktop/test");
        System.out.println(s);
    }

    public static String readFileAsString(String fileName) throws IOException {
        byte[] data = readFileAsByte(fileName);
        String dataStr = new String(data);
        return dataStr;
    }
    public static  byte[] readFileAsByte(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        return Files.readAllBytes(path);

    }






}
