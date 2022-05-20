package org.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Controller {

    @Autowired
    private Service userService;
    @PostMapping("/add")
    public void addUser(@RequestBody Dao user){
        userService.save(user);
    }

//    @Autowired
//    public Service updateUser(User user){
//        return userService.update(user);
//    }
//
//    public Service deleteUser(User user){
//        return userService.delete(user);
//    }

}