package me.dio.Service;

import me.dio.Model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
