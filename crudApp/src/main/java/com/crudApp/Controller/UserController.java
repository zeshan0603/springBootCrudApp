package com.crudApp.Controller;

import com.crudApp.Entity.UserEntity;
import com.crudApp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository repository;

    //API CALLS

    @PostMapping("/addUser")
    public UserEntity addUser(@RequestBody UserEntity entity){
      return repository.save(entity);
    }

    @GetMapping("/users")
    public List<UserEntity> getUsers(){
        return repository.findAll();
    }
    @PutMapping("/updateUser")
    public UserEntity updateUser(@RequestBody UserEntity entity){
        return repository.saveAndFlush(entity);
    }
    @PatchMapping("/patchUser")
    public UserEntity patchUser(@RequestBody UserEntity entity){
        return repository.saveAndFlush(entity);
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestParam Long id){
        repository.deleteById(id);
        return "USER DELETED WITH ID : " + id;
    }
}
