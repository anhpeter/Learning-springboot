package com.peter.LearnSpringBoot.services;

import com.peter.LearnSpringBoot.exceptions.NotFoundException;
import com.peter.LearnSpringBoot.models.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User getById(long id) throws NotFoundException;

    List<User> removeAll();

    User update(long id, User user);

    User remove(long id);
}
