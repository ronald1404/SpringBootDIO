package com.dio.SpringDataJpa;

import com.dio.SpringDataJpa.model.User;
import com.dio.SpringDataJpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StarApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
//
//        User user = new User();
//        user.setName("Ronald");
//        user.setUsername("ronald1404");
//        user.setPassword("1234");
//
//        User userA = new User();
//        userA.setName("Karol");
//        userA.setUsername("karol2510");
//        userA.setPassword("4321");
//
//        repository.save(user);
//        repository.save(userA);

        List<User> users = repository.filterByName("Ronald");
        System.out.println(users);
        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
