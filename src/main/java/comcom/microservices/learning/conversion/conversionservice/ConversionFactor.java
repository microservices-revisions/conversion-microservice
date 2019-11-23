package comcom.microservices.learning.conversion.conversionservice;

import java.math.BigDecimal;

/**
 * Created by nitin on Saturday, November/23/2019 at 10:32 AM
 */


public class ConversionFactor {


    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    //Port number to keep track of the server returning the value
    private int port;

    public ConversionFactor() {
    }

    public ConversionFactor(Long id, String from, String to, BigDecimal conversionMultiple,int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

}
