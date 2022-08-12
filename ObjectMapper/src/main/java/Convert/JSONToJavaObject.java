//package Convert;
//
//import User.User;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import javax.annotation.PostConstruct;
//import java.io.File;
//import java.io.IOException;
//import java.net.URL;
//
//import static Convert.JavaObjectToJSON.objectMapper;
//
//public class JSONToJavaObject {
//
//    @PostConstruct
//    void JSONToJavaObject() throws IOException {
//
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        // String to Object
//        String json = "{ \"name\" : \"Ryan\", \"age\" : 30 }";
//        User user = objectMapper.readValue(json, User.class);
//        // JSON File to Object
//        User user = objectMapper.readValue(new File("user.json"), User.class);
//        // JSON URL to Object
//        User user = objectMapper.readValue(new URL("file:user.json"), User.class);
//    }
//
//}
