package shop.vinoweknow.api.producer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.vinoweknow.api.producer.domain.Producer;
import shop.vinoweknow.api.producer.repository.ProducerRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProducerServiceImpl implements ProducerService{
    private final ProducerRepository producerRepository;

    @Override
    public void save(Producer producer) {
        producerRepository.save(producer);
    }

    @Override
    public List<Producer> findAll() {
        return producerRepository.findAll();
    }

    @Override
    public void existsById(long producerId) {
        producerRepository.existsById(producerId);
    }

    @Override
    public int count() {
        return (int)producerRepository.count();
    }

    @Override
    public Optional<Producer> findById(long producerId) {
        return producerRepository.findById(producerId);
    }

    @Override
    public Producer getById(long producerId) {
        return producerRepository.getById(producerId);
    }

    @Override
    public void deleteById(long producerId) {
        producerRepository.deleteById(producerId);
    }
}
