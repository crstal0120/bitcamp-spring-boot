package shop.vinoweknow.api.pairing.repository;

import shop.vinoweknow.api.pairing.domain.Pairing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PairingRepository extends JpaRepository<Pairing, Long> {
}
