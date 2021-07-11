package shop.vinoweknow.api.pairing.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import shop.vinoweknow.api.pairing.domain.Pairing;
import shop.vinoweknow.api.pairing.service.PairingService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/pairing")
public class PairingController {
    private final PairingService pairingService;

    @GetMapping("")
    public List<Pairing> findAll() {
        return pairingService.findAll();
    }
    @PostMapping("")
    public void save(Pairing pairing) {
        pairingService.save(pairing);
    }
    @GetMapping("/{pairingId}")
    public int count() {
        return pairingService.count();
    }
    @DeleteMapping("/{pairingId}")
    public void deleteById(long pairingId) {
        pairingService.deleteById(pairingId);
    }
    @GetMapping("/exists/{pairingId}")
    public void existsById(long pairingId) {
        pairingService.existsById(pairingId);
    }
    @GetMapping("/find/{pairingId}")
    public Optional<Pairing> findById(long pairingId) {
        return pairingService.findById(pairingId);
    }

    public Pairing getById(long pairingId) {
        return pairingService.getById(pairingId);
    }
}
