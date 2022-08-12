package Convert;

import User.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JavaObjectToJSON {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User("Ryan", 30);

        objectMapper.writeValue(new File("user.json"), user);
//        {"name":"Ryan","age":30}
        String userAsString = objectMapper.writeValueAsString(user);
//        {"name":"Ryan","age":30}

        //System.out.println(userAsString);

        String json = "{ \"name\" : \"asdasd\", \"age\" : 30 }";
        user = objectMapper.readValue(json, User.class);

        System.out.println(user.toString());
        System.out.println(user.getName() + " + " + user.getAge());
    }




}
