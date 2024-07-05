package checkpoint.spring.remote.Controller;

import checkpoint.spring.remote.Entity.User;
import checkpoint.spring.remote.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers() {
       return userService.getUser();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
       return userService.getUserById(id);
    }
    @PutMapping("/{id}")
    public User update(@RequestBody User user, @PathVariable Long id) {
        return userService.updateUser(user);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteUser(id);
    }


}
