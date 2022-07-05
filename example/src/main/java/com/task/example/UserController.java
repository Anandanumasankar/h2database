package com.task.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/useroperations")
public class UserController {
    @RequestMapping("/userobj")
    public List<Users> returnobj(){
        return Arrays.asList(
                new Users(1234,"Titanic",4)
        );
    }


    @Autowired
    private UsersRepository userrepo;

    @PostMapping("/post")
    public String adduser(@RequestBody  Users user){
        userrepo.save(user);
        return "User added successfully";
    }
    @GetMapping("/get")
    public Users getuser(int movieid){
        return userrepo.findById(movieid).orElse(null);
    }
    @PutMapping("put")
    public String updateuser(Users user){
         userrepo.save(user);
        return "Updation successfull";
    }
    @DeleteMapping("/delete")
    public String deleteuser(int movieid){
         userrepo.deleteById(movieid);
        return "Deletion successfully ";
    }
}
