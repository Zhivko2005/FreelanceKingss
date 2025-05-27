package FreelanceKings.FreelanceKingss.Service;

import FreelanceKings.FreelanceKingss.Models.User;
import FreelanceKings.FreelanceKingss.Repostiories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<User> getAllUsers(){
        return  userRepository.findAll();
    }
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Skill not found"));
    }
    public User createUser(User user){
      return userRepository.save(user);
    }

    public User updateUser(long id, User updatedUser)
    {
        User user = getUserById(id);
        user.setUserName(updatedUser.getUserName());
        user.setPassword(updatedUser.getPassword());
        user.setAge(updatedUser.getAge());
        user.setEmail(updatedUser.getEmail());
        user.setRole(updatedUser.getRole());
        user.setSkillList(updatedUser.getSkillList());
        return userRepository.save(user);
    }
    public void deleteUser(long id ){
        userRepository.deleteById(id);
    }
}
