import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteToFile_NIO {

    public static void main(String[] args) {
        copyFileUsingPath();

    }

    public static void writeUsingPath(String data,boolean append) throws IOException {
        Path path = Paths.get("test");
        if(append)
            Files.write(path,data.getBytes(), StandardOpenOption.APPEND);
        else
            Files.write(path,data.getBytes());
    }

    public static void writeUsingBufferedWriter() throws IOException {
        Path path = Paths.get("test1");
        BufferedWriter writer = Files.newBufferedWriter(path);
        try {
            writer.write("To be or not to be?");
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            writer.close();
        }
    }

    public static void copyFileUsingPath(){
        Path oldFile = Paths.get("/home/murad_isgandar/Desktop/download.png");
        Path newFile = Paths.get("/home/murad_isgandar/Desktop/download2.png");
        try (OutputStream os = new FileOutputStream(newFile.toFile())){
            Files.copy(oldFile,os);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }







}
