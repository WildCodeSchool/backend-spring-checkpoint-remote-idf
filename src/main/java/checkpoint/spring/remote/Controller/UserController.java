package checkpoint.spring.remote.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import checkpoint.spring.remote.Entity.User;
import checkpoint.spring.remote.Service.UserService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "Get all users", description = "Get all users")
    @GetMapping("")
    public List<User> getAll() {
        return this.userService.getAll();
    }

    
    @Operation(summary = "Get user by id", description = "Get user by id")
    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return this.userService.getById(id);
    }

    @Operation(summary = "update user by id", description = "update user by id")
    @PutMapping("/{id}")
    public User updateById(@PathVariable Long id, @RequestBody User user )  {
        User userToUpdate =this.userService.getById(id);
         userToUpdate.setImageUrl(user.getImageUrl());
        System.out.println(user);
        return this.userService.updateUSer(userToUpdate);
    }

     @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }



    
}
