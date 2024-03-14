package com.peter.quickstart;

import com.peter.quickstart.model.MyUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private final MyUser myUser;

    public HelloWorldController (MyUser myUser) {
        this.myUser = myUser;
    }


    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello " + this.myUser.getUserInfo();
    }
}
