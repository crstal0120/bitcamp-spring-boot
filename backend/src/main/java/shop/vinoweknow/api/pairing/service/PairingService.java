package shop.vinoweknow.api.pairing.service;

import shop.vinoweknow.api.pairing.domain.Pairing;

import java.util.List;
import java.util.Optional;

public interface PairingService {
    List<Pairing> findAll();
    void save(Pairing pairing);
    int count();
    void deleteById(long pairingId);
    void existsById(long pairingId);
    Optional<Pairing> findById(long pairingId);
    Pairing getById(long pairingId);
}
