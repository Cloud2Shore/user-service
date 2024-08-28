package userservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserServiceController {

    @GetMapping("/authenticate")
    public boolean authenticateUser(@RequestParam("userId") String userId) {
        // Placeholder for real authentication logic
        return true;
    }
}

