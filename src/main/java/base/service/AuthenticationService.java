package base.service;

import base.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
