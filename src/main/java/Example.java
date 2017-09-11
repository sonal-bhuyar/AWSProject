import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by NalinBakshi on 9/11/2017.
 */
@RestController("/")
@EnableAutoConfiguration
public class Example {

    @RequestMapping( method = RequestMethod.GET)
    public @ResponseBody Greetings home(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greetings("Hello "+name.trim());
    }


    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }
}
