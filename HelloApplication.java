import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {

    @GetMapping("/")
    public String greet() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        // Cloud Run / GCP uses port 8080
        System.setProperty("server.port", "8080");
        SpringApplication.run(HelloApplication.class, args);
        System.out.println("App is running at: http://127.0.0.1:8080");
    }
}
