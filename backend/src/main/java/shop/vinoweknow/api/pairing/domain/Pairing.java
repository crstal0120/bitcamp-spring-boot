package shop.vinoweknow.api.pairing.domain;


import lombok.*;
import javax.persistence.*;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "parings")
public class Pairing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long pairing_Id;

    @Column private String pairing_SerialNo;
    @Column private String meat;
    @Column private String seafood;
    @Column private String vegetable;
    @Column private String dessert;
    @Column private String cheese;
    @Column private String other;
}
