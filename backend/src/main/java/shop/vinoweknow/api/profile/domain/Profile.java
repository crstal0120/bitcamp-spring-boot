package shop.vinoweknow.api.profile.domain;

import lombok.*;
import javax.persistence.*;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long profile_Id;

    @Column private String profile_SerialNo;
    @Column private String Dry;
    @Column private String sweetness;
    @Column private String Tannin;
    @Column private String Acidity;
}
