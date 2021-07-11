package shop.vinoweknow.api.profile.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import shop.vinoweknow.api.profile.domain.Profile;
import shop.vinoweknow.api.profile.repository.ProfileRepository;
import shop.vinoweknow.api.profile.service.ProfileService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/profiles")
public class ProfileController {
    private final ProfileService profileService;

    @PostMapping("")
    public void save(Profile profile) {
        profileService.save(profile);
    }
    @GetMapping("")
    public List<Profile> findAll() {
        return profileService.findAll();
    }
    @GetMapping("/exists/{profileid}")
    public void existsById(long profileId) {
        profileService.existsById(profileId);
    }
    @GetMapping("/count")
    public int count() {
        return profileService.count();
    }
    @GetMapping("/find/{profileId}")
    public Optional<Profile> findById(long profileId) {
        return profileService.findById(profileId);
    }
    @GetMapping("/{profileId}")
    public Profile getById(long profileId) {
        return profileService.getById(profileId);
    }
    @DeleteMapping("/{profileId}")
    public void deleteById(long profileId) {
        profileService.deleteById(profileId);
    }
}
