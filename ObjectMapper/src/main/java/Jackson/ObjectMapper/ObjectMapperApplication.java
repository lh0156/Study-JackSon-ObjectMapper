package Jackson.ObjectMapper;

import Convert.JavaObjectToJSON;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObjectMapperApplication {

	public static void main(String[] args) {
//		JavaObjectToJSON javaObjectToJSON = new JavaObjectToJSON();
		SpringApplication.run(ObjectMapperApplication.class, args);
	}

}
