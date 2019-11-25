package comcom.microservices.learning.conversion.conversionservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.math.BigDecimal;

/**
 * Created by nitin on Saturday, November/23/2019 at 10:20 AM
 */

@RestController
public class HelloController {

    @Autowired
    private ConversionFactorRepository conversionFactorRepository;

    //Adding Port number
    @Autowired
    private Environment environment;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/convert/from/{from}/to/{to}")
    public ConversionFactor retreiveConverFactor(@PathVariable String from, @PathVariable String to){
        //ConversionFactor conversionFactor = new ConversionFactor(1000L, from, to, BigDecimal.valueOf(12345.678),0);

        //Connecting with Database
        ConversionFactor conversionFactor = conversionFactorRepository.findByFromAndTo(from,to);
        conversionFactor.setPort(Integer.parseInt(environment.getProperty("local.server.port")));

        logger.info("{}",conversionFactor);
        return conversionFactor;
    }

    @GetMapping("/")
    public String helloWorld(){
        logger.info("√ Conversion service is up and running : ");
        return "Conversion service is up and running : ";
    }
}
