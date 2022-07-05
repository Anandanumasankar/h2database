package com.example.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Controller
//@RequestMapping("/getaratedmovie")
public class UsersController {
    @Autowired
    private RestTemplate rest;
    @GetMapping("/users")
    public List<Users> user() {
        System.out.println("process starts");
        UserWrapper wrapper= rest.getForObject("http://localhost:8080/useroperations/getallmovies",UserWrapper.class);
        System.out.println("process intermediate");
        //return wrapper.getUsersList().stream().filter(ratings->ratings.getRatings()>4).collect(Collectors.toList());
        return null;
    }
}

