package shop.vinoweknow.api.profile.service;

import shop.vinoweknow.api.profile.domain.Profile;

import java.util.List;
import java.util.Optional;

public interface ProfileService {
    void save(Profile profile);
    List<Profile> findAll();
    void existsById(long profileId);
    int count();
    Optional<Profile> findById(long profileId);
    Profile getById(long profileId);
    void deleteById(long profileId);
}
