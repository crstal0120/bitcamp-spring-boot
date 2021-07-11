package shop.vinoweknow.api.producer.domain;

import lombok.Data;

import javax.persistence.Column;

@Data
public class ProducerDto {
    private long producer_Id;
    private String producer_SerialNo;
    private String winery;
    private String country;
    private String local;
    private String numberOfWines;
}
