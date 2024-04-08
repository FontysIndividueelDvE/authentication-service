package authenticationservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestController {
    @GetMapping("/test")
    public final String testGetMethod() {
        return "Hello world from authentication-service, only accessible with a valid token!";
    }
}
