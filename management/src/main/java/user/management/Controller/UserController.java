package user.management.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user.management.Entity.UserEntity;
import user.management.Servise.UserService;

@RestController
@RequestMapping("/api/auth")
public class UserController {

       private final UserService userService;

       public UserController(UserService userService) {
            this.userService = userService;
       }


    @PostMapping("/register")
     public String RegisterUser(@RequestBody UserEntity user) {
           return userService.RegisterUser(user);
     }

}
