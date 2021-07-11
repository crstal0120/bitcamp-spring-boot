package shop.vinoweknow.api.user.service;

import shop.vinoweknow.api.user.domain.User;

public interface UserService {
    void signup(User user);
    void login(User user);
}
