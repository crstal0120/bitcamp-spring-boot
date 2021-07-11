package shop.vinoweknow.api.pairing.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import shop.vinoweknow.api.pairing.domain.Pairing;
import shop.vinoweknow.api.pairing.repository.PairingRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PairingServiceImpl implements PairingService{
    PairingRepository pairingRepository;

    @Override
    public List<Pairing> findAll(){
        return pairingRepository.findAll();
    }
    @Override
    public void save(Pairing pairing){
        pairingRepository.save(pairing);
    }
    @Override
    public int count(){
        return (int)pairingRepository.count();
    }
    @Override
    public void deleteById(long pairingId){
        pairingRepository.deleteById(pairingId);
    }
    @Override
    public void existsById(long pairingId){
        pairingRepository.existsById(pairingId);
    }
    @Override
    public Optional<Pairing> findById(long pairingId){
        return pairingRepository.findById(pairingId);
    }
    @Override
    public Pairing getById(long pairingId){
        return pairingRepository.getById(pairingId);
    }
}
