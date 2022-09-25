package com.peter.LearnSpringBoot.services;

import com.peter.LearnSpringBoot.exceptions.NotFoundException;
import com.peter.LearnSpringBoot.models.User;
import com.peter.LearnSpringBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(long id) throws NotFoundException {
        return userRepository.findById(id).orElseThrow(()-> new NotFoundException());

    }

    @Override
    public List<User> removeAll() {
        List<User> users = getAll();
        userRepository.deleteAll();
        return users;
    }

    @Override
    public User update(long id, User user) {
        User existedUser = userRepository.findById(id).get();
        if (existedUser!=null){
            if (Objects.nonNull(user.getEmail())
                    && !"".equalsIgnoreCase(user.getEmail())){
                existedUser.setEmail(user.getEmail());
            }
            if (Objects.nonNull(user.getFirstName())
                    && !"".equalsIgnoreCase(user.getFirstName())){
                existedUser.setFirstName(user.getFirstName());
            }
            if (Objects.nonNull(user.getLastName())
                    && !"".equalsIgnoreCase(user.getLastName())){
                existedUser.setLastName(user.getLastName());
            }
            if (Objects.nonNull(user.getPhone())
                    && !"".equalsIgnoreCase(user.getPhone())){
                existedUser.setPhone(user.getPhone());
            }
            return userRepository.save(existedUser);
        }
        return null;
    }

    @Override
    public User remove(long id) {
        User existedItem =  userRepository.findById(id).orElseThrow(()-> new NotFoundException());
        userRepository.deleteById(id);
        return existedItem;
    }
}