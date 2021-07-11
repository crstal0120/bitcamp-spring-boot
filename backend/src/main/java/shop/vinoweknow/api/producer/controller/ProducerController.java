package shop.vinoweknow.api.producer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import shop.vinoweknow.api.producer.domain.Producer;
import shop.vinoweknow.api.producer.service.ProducerService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/producers")
public class ProducerController {
    private final ProducerService producerService;

    @PostMapping("")
    public void save(@RequestBody Producer producer) {
        producerService.save(producer);
    }
    @GetMapping("")
    public List<Producer> findAll() {
        return producerService.findAll();
    }
    @GetMapping("/exists/{producerId}")
    public void existsById(@RequestParam long producerId) {
        producerService.existsById(producerId);
    }
    @GetMapping("/count")
    public int count() {
        return producerService.count();
    }
    @GetMapping("/find/{producerId}")
    public Optional<Producer> findById(@RequestParam long producerId) {
        return producerService.findById(producerId);
    }
    @GetMapping("/{producerId}")
    public Producer getById(@RequestParam long producerId) {
        return producerService.getById(producerId);
    }
    @DeleteMapping("/{producerId}")
    public void deleteById(long producerId) {
        producerService.deleteById(producerId);
    }
}
