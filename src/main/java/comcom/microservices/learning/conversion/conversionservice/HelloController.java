package comcom.microservices.learning.conversion.conversionservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by nitin on Saturday, November/23/2019 at 10:20 AM
 */

@RestController
public class HelloController {


    @GetMapping("/convert/from/{from}/to/{to}")
    public ConversionFactor retreiveConverFactor(@PathVariable String from, @PathVariable String to){
        ConversionFactor conversionFactor = new ConversionFactor(1000L, from, to, BigDecimal.valueOf(12345.678),0);
        return conversionFactor;
    }

    @GetMapping("/")
    public String helloWorld(){
        return "Conversion service is up and running : ";
    }
}
