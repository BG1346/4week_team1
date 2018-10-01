package team1;

/**
 * Hello world!
 *
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class App {
    @Value("${environment.message}")
    private String message;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World! This is " + message ;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("test");
        System.out.println("test2");
        SpringApplication.run(App.class, args);
    }
}
