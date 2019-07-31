import beans.User;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        User user = new User("Murad","Isgandarli",18,"2354536");
//        WriteToFile_IO.writeObjectToFile(user,"userMurad");
//
//        user = (User) ReadFile_IO.readFileDeserialize("userMurad");
//        System.out.println(user.getName());
//        System.out.println(user.getSurname());
//        System.out.println(user.getAge());
//        System.out.println(user.getPassword());
//        WriteToFile_IO.writeUsingFileWriter("Murad ");
//        WriteToFile_IO.writeUsingFileWriter("Murad ",true);
        WriteToFile_NIO.writeUsingPath("Hello",true);


    }

}

