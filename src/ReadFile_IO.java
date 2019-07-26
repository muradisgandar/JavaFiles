import java.io.*;
import java.util.Scanner;

public class ReadFile_IO {
    private static String FILENAME = "/home/murad_isgandar/Desktop/test";
    public static void main(String[] args) throws Exception {


    }

    public static void readUsingScanner() throws Exception {

        File file =  new File(FILENAME);
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine())
            System.out.println(sc.nextLine());

    }
    public static void readUsingBufferedReaderAutoCloseable(){
        try (BufferedReader bw = new BufferedReader(new FileReader(FILENAME))){

            String sCurrentLine;

            while((sCurrentLine = bw.readLine()) != null){
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFileUsingInputStream(){
        try (InputStream in = new FileInputStream(FILENAME)){
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

        }  catch (IOException e) {
            System.err.println(e);
        }


    }
    public static void readFileUsingByte() throws Exception {
        //getBytes from anywhere
        //I m getting byte array from file
        File file = null;
        FileInputStream fileStream = new FileInputStream(file = new File(FILENAME));

        //Innstantiate array
        byte[] arr = new byte[(int)file.length()];

        //read All bytes of File stream
        fileStream.read(arr,0,arr.length);

        for(int x:arr){

            System.out.print((char) x);
        }




    }
    public static void readUsingBufferedReader(){
        BufferedReader br = null;
        FileReader fr = null;
        try {
            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;
            while((sCurrentLine = br.readLine()) !=null){
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(br!= null)
                    br.close();
                if(fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void readUsingFileReader() throws IOException {
        FileReader fr = new FileReader(FILENAME);

        int i;
        while((i=fr.read()) != -1)
            System.out.println((char) i);
    }
    public static Object readFileDeserialize(String name){
        Object obj = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))) {
            obj = in.readObject();
            return obj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally {
            return obj;
        }
    }











}
