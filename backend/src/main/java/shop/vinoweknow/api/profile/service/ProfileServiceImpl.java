package shop.vinoweknow.api.profile.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.vinoweknow.api.profile.domain.Profile;
import shop.vinoweknow.api.profile.repository.ProfileRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService{
    ProfileRepository profileRepository;

    @Override
    public void save(Profile profile) {
        profileRepository.save(profile);
    }

    @Override
    public List<Profile> findAll() {
        return profileRepository.findAll();
    }

    @Override
    public void existsById(long profileId) {
        profileRepository.existsById(profileId);
    }

    @Override
    public int count() {
        return (int)profileRepository.count();
    }

    @Override
    public Optional<Profile> findById(long profileId) {
        return profileRepository.findById(profileId);
    }

    @Override
    public Profile getById(long profileId) {
        return profileRepository.getById(profileId);
    }

    @Override
    public void deleteById(long profileId) {
        profileRepository.deleteById((profileId));
    }
}
