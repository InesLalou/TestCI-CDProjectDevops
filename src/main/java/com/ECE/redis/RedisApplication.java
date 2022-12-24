package com.ECE.redis;

import com.ECE.redis.entity.User;
import com.ECE.redis.respository.UserAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/user")
public class RedisApplication {
    @Autowired
    private UserAction userAction;

    @PostMapping
    public User save(@RequestBody User user) {
        return userAction.save(user);
    }

    @GetMapping
    public List<User> getAllProducts() {
        return userAction.findAll();
    }

    @GetMapping("/{id}")
    public User findProduct(@PathVariable int id) {
        return userAction.findUserById(id);
    }
    
    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id)   {
    	return userAction.deleteUser(id);
	}


    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }

}
