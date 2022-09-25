package com.peter.LearnSpringBoot.apis;

import com.peter.LearnSpringBoot.exceptions.NotFoundException;
import com.peter.LearnSpringBoot.models.User;
import com.peter.LearnSpringBoot.services.UserServiceImpl;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("users")
public class UserApi {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping()
    public User create(@RequestBody User user) {
        return userServiceImpl.save(user);
    }

    @GetMapping()
    public List<User> getAll() {
        return userServiceImpl.getAll();
    }

    @GetMapping("{id}")
    public User getById(@PathVariable("id") long id) {
        return userServiceImpl.getById(id);
    }

    @DeleteMapping()
    public List<User> removeAll() {
        return userServiceImpl.removeAll();
    }

    @PatchMapping("{id}")
    public User update(@PathVariable("id") long id, @RequestBody User user) {
        return userServiceImpl.update(id, user);
    }

    @DeleteMapping("{id}")
    public User remove(@PathVariable() long id) {
        return userServiceImpl.remove(id);
    }

    @GetMapping("test")
    public String test(@Parameter(description = "Program id") @RequestHeader() int programId){
        return programId+"";
    }
}
