package comcom.microservices.learning.conversion.conversionservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nitin on Saturday, November/23/2019 at 10:20 AM
 */

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld(){
        return "Conversion service is up and running : ";
    }
}
