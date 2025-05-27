package FreelanceKings.FreelanceKingss.Controllers;

import FreelanceKings.FreelanceKingss.Models.User;
import FreelanceKings.FreelanceKingss.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.awt.desktop.UserSessionEvent;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable long id){
        return userService.getUserById(id);
    }
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @PutMapping("/{id}")
    public User updateUser(@PathVariable long id,@RequestBody User user){
        return userService.updateUser(id,user);
    }
    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable long id){
        userService.deleteUser(id);
    }
}