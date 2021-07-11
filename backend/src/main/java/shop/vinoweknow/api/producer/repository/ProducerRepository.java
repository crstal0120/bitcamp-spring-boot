package shop.vinoweknow.api.producer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.vinoweknow.api.producer.domain.Producer;

@Repository
public interface ProducerRepository extends JpaRepository<Producer, Long> {
}
