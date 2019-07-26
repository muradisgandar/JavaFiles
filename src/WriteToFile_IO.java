import java.io.*;

public class WriteToFile_IO {
    private static void writeUsingOutputStream(String data){
        File f = new File("/home/murad_isgandar/Desktop/test");

        try (OutputStream os = new FileOutputStream(f)){
            os.write(data.getBytes(),0,data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static void writeUsingFileWriter(String data){
        File file = new File("/home/murad_isgandar/Desktop/test");
        try(FileWriter fr = new FileWriter(file)){
            fr.write(data);
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void writeUsingBufferedWriterAutoCloseable() throws IOException {
        FileWriter f = new FileWriter("/home/murad_isgandar/Desktop/test");
        try (BufferedWriter bw = new BufferedWriter(f)){
            String content = "This is the content which is written into file";
            bw.write(content);

            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //no need to close it
        //bw.close()
    }
    public static void writeObjectToFile(Object object,String name){
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;

        try {

            fout = new FileOutputStream(name);
            oos = new ObjectOutputStream(fout);
            oos.writeObject(object);


        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void main(String[] args) {

        //writeUsingOutputStream("Salam");



    }
}
