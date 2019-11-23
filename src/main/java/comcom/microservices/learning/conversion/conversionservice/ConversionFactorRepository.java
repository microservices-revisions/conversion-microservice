package comcom.microservices.learning.conversion.conversionservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nitin on Saturday, November/23/2019 at 11:40 AM
 */
public interface ConversionFactorRepository extends JpaRepository<ConversionFactor,Long> {
    ConversionFactor findByFromAndTo(String from, String to);
}
