import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserDataController {

    @GetMapping("/users/{userId}")
    public User getUserData(@PathVariable("userId") int userId) {
        // retrieve user data from database
        User user = userRepository.findById(userId);
        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserDataController.class, args);
    }
}
