package shop.vinoweknow.api.producer.service;

import shop.vinoweknow.api.producer.domain.Producer;

import java.util.List;
import java.util.Optional;

public interface ProducerService {
    void save(Producer producer);
    List<Producer> findAll();
    void existsById(long producerId);
    int count();
    Optional<Producer> findById(long producerId);
    Producer getById(long producerId);
    void deleteById(long producerId);
}
