package org.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Controller {

    private final Service userService;

    public Controller(Service userService) {
        this.userService = userService;
    }

    @PostMapping("/user/add")
    public void saveD(@RequestBody Service.ValidatedCreateUserContext context){
        userService.save(context);
    }

}