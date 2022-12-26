package com.ECE.redis.folder;
 
import com.ECE.redis.entity.User;
import com.ECE.redis.respository.UserAction;
import com.ECE.redis.folder.RedisJavaz;

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
	    
	RedisJavaz cache = new RedisJavaz();
        cache.cache_value("answer_to_the_ultimate_question_of_life_the_universe_and_everything",String.valueOf(42));

        System.out.println("Cached value: " + cache.get_cached_value("answer_to_the_ultimate_question_of_life_the_universe_and_everything"));
    }

}
