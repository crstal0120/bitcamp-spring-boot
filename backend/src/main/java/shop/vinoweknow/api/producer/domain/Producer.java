package shop.vinoweknow.api.producer.domain;

import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "producers")
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long producer_Id;

    @Column private String producer_SerialNo;
    @Column private String winery;
    @Column private String country;
    @Column private String local;
    @Column private String numberOfWines;
}
