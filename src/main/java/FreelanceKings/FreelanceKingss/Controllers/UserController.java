package FreelanceKings.FreelanceKingss.Controllers;

import FreelanceKings.FreelanceKingss.Models.User;
import FreelanceKings.FreelanceKingss.Repostiories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.desktop.UserSessionEvent;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    public UserRepository userRepository ;
    List<User> users;



    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}