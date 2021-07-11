package shop.vinoweknow.api.profile.domain;

import lombok.Data;

import javax.persistence.Column;

@Data
public class ProfileDto {
    private long profile_Id;
    private String profile_SerialNo;
    private String Dry;
    private String sweetness;
    private String Tannin;
    private String Acidity;

}
