package checkpoint.spring.remote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import checkpoint.spring.remote.entity.User;
import checkpoint.spring.remote.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

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

    @Operation(summary = "Create User", description = "Create User")
    @PostMapping("")
    public User create(@RequestBody User user) {
        return this.userService.create(user);
    }

    @Operation(summary = "Update User", description = "Update User")
    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return this.userService.update(id, user);
    }

    @Operation(summary = "Delete User", description = "Delete User")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.userService.delete(id);
    }
}
