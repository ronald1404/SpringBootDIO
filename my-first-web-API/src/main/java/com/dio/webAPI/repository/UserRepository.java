package com.dio.webAPI.repository;

import org.springframework.stereotype.Repository;
import com.dio.webAPI.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user){
        if(user.getId()==null)
            System.out.println("SAVE - Getting the user in the repository layer");
        else
            System.out.println("UPDATE - Getting the user in the repository layer");

        System.out.println(user);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Getting id: %d to delete a user", id));
        System.out.println(id);
    }
    public List<User> findAll(){
        System.out.println("LIST - Listing system users");
        List<User> users = new ArrayList<>();
        users.add(new User("ronald","password"));
        users.add(new User("frank","masterpass"));
        return users;
    }
    public User findById(Integer id){
        System.out.println("FIND/id - 'Getting id:" +id+ " to find a user'");
        return new User("ronald","password");
    }
    public User findByUsername(String username){
        System.out.println("FIND/username - Receiving the username: "+username+ " to find a user");
        return new User("ronald","password");
    }
}
