package com.example.caller;

import com.example.caller.resources.UserWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
    @GetMapping("/getallmovies")
    public List<Users> getallMovies(){
//        ArrayList<Users> userlist=new ArrayList<>();
        List<Users>userlist=(List<Users>)userrepo.findAll();
        UserWrapper wrapper = new UserWrapper();
        wrapper.setUsersList(userlist);
        return userlist;
    }
    @GetMapping("/get")
    public Users getuser(int movieid){
        return userrepo.findById(movieid).orElse(null);
    }

    @PutMapping("/put")
    public Users updateuserbyid(Users user ){
//        Users updated1= new Users();
         Optional<Users> updated=userrepo.findById(user.getId());
         if(updated.isPresent()){
             System.out.println("positive loop starting");
             Users newuser=updated.get();
             newuser.setMoviename(user.getMoviename());
             newuser= userrepo.save(newuser);
             System.out.println("updation successfull");
             return newuser;
         }else{
             System.out.println("negative loop starting");
             System.out.println("Member mentioned is not present");
             return null;
         }


    }
    @DeleteMapping("/delete")
    public String deleteuser(@RequestParam("id") int movieid){
         userrepo.deleteById(movieid);
        return "Deletion successfully ";
    }
}
