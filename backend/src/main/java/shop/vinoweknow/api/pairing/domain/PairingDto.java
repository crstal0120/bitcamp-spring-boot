package shop.vinoweknow.api.pairing.domain;

import lombok.Data;

@Data
public class PairingDto {

    private long pairing_Id;
    private String pairing_SerialNo;
    private String meat;
    private String seafood;
    private String vegetable;
    private String dessert;
    private String cheese;
    private String other;

}
